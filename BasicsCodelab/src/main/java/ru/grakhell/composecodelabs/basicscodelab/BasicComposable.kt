package ru.grakhell.composecodelabs.basicscodelab

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
private fun Greeting(name: String) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        GreetingContent(name)
    }

}

@Composable
private fun GreetingContent(name: String) {
    val expanded = remember { mutableStateOf(false) }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
        .animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            )
        )
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp)) {
            Text(text = "Hello, ")
            Text(text = name, style = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.ExtraBold))
            if (expanded.value) {
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                    " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                    " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
                    "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
                    "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
                    "deserunt mollit anim id est laborum.")
            }
        }
        IconButton(onClick = { expanded.value = !expanded.value }) {
            Icon(if (expanded.value) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                contentDescription = if(expanded.value) stringResource(R.string.show_less)  else stringResource(R.string.show_more) )
        }
    }
}
@Composable
fun App() {
    var shouldShowOnboarding by rememberSaveable{ mutableStateOf(true) }
    if (shouldShowOnboarding) {
        OnboardingScreen (onContinueClicked = { shouldShowOnboarding = false })
    } else {
        Greetings()
    }
}

@Composable
fun Greetings(names: List<String> = List(1000) { "$it" }) {
    Surface(
        color = MaterialTheme.colors.background
    ) {
        LazyColumn(modifier = Modifier.padding(vertical = 8.dp)){
            items(items = names) { name ->
                Greeting(name)
            }
        }
    }
}

@Composable
fun OnboardingScreen(onContinueClicked: () -> Unit) {
    Surface{
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to the Basics Codelab!")
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = onContinueClicked
            ) {
                Text("Continue")
            }
        }
    }
}

