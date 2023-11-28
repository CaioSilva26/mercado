package com.example.mercado.ui.TelaMecanica

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mercado.R
import com.example.mercado.model.Mecanica

@Composable
fun TelaMecanica(
    espacoDasBarras: PaddingValues,
    controleNavegacao: NavController
) {

    Column(
        modifier = Modifier
            .padding(espacoDasBarras)
    ) {
        Text(
            text = "Funcionou!!!"
        )
        Button(
            onClick = {
                controleNavegacao.navigate("TelaLogin")
            }
        ) {
            Text(text = "Voltar")

        }

    }

}
@Preview(showSystemUi = true)
@Composable
fun ListaDeCompras(listaMecanica:List<Mecanica>) {
    LazyColumn {
        items()

    }
}
@Preview
@Composable
fun CardMecanica() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)

    ){
        Column {
            Row {


                Image(
                    painter = painterResource(id = R.drawable.chavedefenda),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(70.dp)


                )
                Column {


                    Text(
                        text = "Chave de Fenda",
                        fontSize = 25.sp

                    )
                    Text(
                        text = "Descrição",
                        fontSize = 16.sp

                    )
                }
                Icon(imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = null
                )
            }
            Column {
                Text(
                    text = "Usado pra Manutenções Profissionais",
                    fontSize = 15.sp

                )
                Text(
                    text = "R$ 10,00"
                )
            }
        }
    }
}