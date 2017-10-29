package signos.android.projetos.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;

    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra",
                                "Escorpião", "Sagitário", "Capricórnio", "Aquário",  "Peixes"};

    private String[] detalhes = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra",
            "Escorpião", "Sagitário", "Capricórnio", "Aquário",  "Peixes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                 getApplicationContext(),
                 android.R.layout.simple_expandable_list_item_1,
                 android.R.id.text1,
                signos
        );
        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codigoPosicao = position;
                Toast.makeText(getApplicationContext(),
                        listaSignos.getItemAtPosition(codigoPosicao).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
