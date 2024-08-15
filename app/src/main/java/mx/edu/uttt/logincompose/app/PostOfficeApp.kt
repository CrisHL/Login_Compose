package mx.edu.uttt.logincompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mx.edu.uttt.logincompose.screens.SignUpScreen
import mx.edu.uttt.logincompose.screens.TerminosCondicionesScreen

@Composable
fun PostOfficeApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        Crossfade(targetState = PostOfficeAppRouter.pantallaConcurrente) {
                currentState ->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TerminosCondicionesScreen ->{
                    TerminosCondicionesScreen()
                }
            }
        }
    }
}