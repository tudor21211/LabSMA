package ro.upt.ac.chiuitter.presentation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ro.upt.ac.chiuitter.R
import ro.upt.ac.chiuitter.data.database.ChiuitDbStore
import ro.upt.ac.chiuitter.data.database.RoomDatabase
import ro.upt.ac.chiuitter.data.dummy.DummyChiuitStore
import ro.upt.ac.chiuitter.domain.Chiuit
import ro.upt.ac.chiuitter.presentation.HomeViewModel
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.getValue
import ro.upt.ac.chiuitter.data.database.AppDatabase

class HomeActivity : AppCompatActivity() {

    private val chiuitText = mutableStateOf("")
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = HomeViewModel(ChiuitDbStore(RoomDatabase.getDb(this)))
        setContent { HomeScreen() }
    }

    @Composable
    private fun HomeScreen() {
        Surface(color = Color.White) {
            Box(modifier = Modifier.fillMaxSize()) {
                val chiuitList by viewModel.chiuitListState.collectAsState() //LINIA NECESARA PT UPDATEUL UI-ULUI
                LazyColumn {
                    items(chiuitList) {
                        ChiuitListItem(chiuit = it)
                    }
                }

                AddFloatingButton(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(16.dp),
                )
            }
        }
    }

    @Composable
    private fun ChiuitListItem(chiuit: Chiuit) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier
                        .weight(0.8f)
                        .padding(8.dp),
                    text = chiuit.description,
                )
                Button(
                    modifier = Modifier
                        .weight(0.3f)
                        .padding(8.dp),
                    onClick = { shareChiuit(chiuit.description) }) {
                    Icon(
                        Icons.Filled.Send,
                        stringResource(R.string.send_action_icon_content_description)
                    )
                }
                // TODO 12: Add a new button that has the purpose to delete a chiuit.
                Button(
                    modifier = Modifier
                        .weight(0.2f)
                        .padding(8.dp),
                    onClick = { viewModel.removeChiuit(chiuit) }) {
                }
            }
        }
    }

    @Composable
    private fun AddFloatingButton(modifier: Modifier) {
        FloatingActionButton(
            modifier = modifier,
            onClick = { composeChiuit() },
        ) {
            Icon(
                Icons.Filled.Edit,
                stringResource(R.string.edit_action_icon_content_description)
            )
        }
    }

    /*
    Defines text sharing/sending *implicit* intent, opens the application chooser menu,
    and starts a new activity which supports sharing/sending text.
     */
    private fun shareChiuit(text: String) {
        val sendIntent = Intent().apply {

            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, text)
                type = "text/plain"
            }

            val intentChooser = Intent.createChooser(sendIntent, "")

            startActivity(intentChooser)


        }

        val intentChooser = Intent.createChooser(sendIntent, "")

        startActivity(intentChooser)
    }

    /*
    Defines an *explicit* intent which will be used to start ComposeActivity.
     */
    private fun composeChiuit() {

        val sendIntent = Intent(this, ComposeActivity::class.java)

        startActivityForResult(sendIntent, 1213)


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            COMPOSE_REQUEST_CODE -> if (resultCode == RESULT_OK) extractText(data)
            else -> super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun extractText(data: Intent?) {
        data?.let {
            val extractedData = data.getStringExtra(ComposeActivity.EXTRA_TEXT)

            if (!extractedData.isNullOrEmpty()) {
                chiuitText.value = extractedData

                viewModel.addChiuit(chiuitText.value)
                // TODO 9': Instantiate a new chiuit object then delegate the addition to the [viewModel].
            }
        }
    }
        @Preview(showBackground = true)
        @Composable
        fun DefaultPreview() {
            HomeScreen()
        }

    companion object {
        const val COMPOSE_REQUEST_CODE = 1213
    }

}

