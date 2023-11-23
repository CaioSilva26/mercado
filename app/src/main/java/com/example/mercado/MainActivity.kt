package com.example.mercado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mercado.ui.theme.MercadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MercadoTheme {
                mercado()

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun mercado() {
    var nome by remember { mutableStateOf("") }
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var confirmarSenha by remember { mutableStateOf("") }
    var cadastrar by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.LightGray
                ),
                title = {
                    Text(
                        text = "Mecânica"
                    )
                }, navigationIcon = {
                    if (cadastrar){
                        CampoDeTexto(
                            value = ,
                            onValueChange = ,
                            idTexto =
                        )
                    }
                })

        }
    ) {

    }



    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.animateContentSize(
            animationSpec =
        )

    ) {
        if (cadastrar) {
            CampoDeTexto(
                value = nome,
                onValueChange = { nome = it },
                idTexto = R.string.nome
            )
            Spacer(modifier = Modifier.size(20.dp))
        }
        CampoDeTexto(
            value = login,
            onValueChange = { login = it },
            idTexto = R.string.login
        )
        Spacer(modifier = Modifier.size(20.dp))
        CampoDeTexto(
            value = senha,
            onValueChange = { senha = it },
            idTexto = R.string.senha
        )
        if (!cadastrar) {
            Text(
                text = "Cadastrar Conta",
                modifier = Modifier.clickable {
                    cadastrar = !cadastrar
                }
            )

        }
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Entrar")
        }

    }


}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoDeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    idTexto: Int
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = stringResource(idTexto))
        }
    )
}


