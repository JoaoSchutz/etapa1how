package ads.schutz.univali.com.tarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ads.schutz.univali.com.tarefas.model.Tarefa;


public class ListarTarefasActivity extends AppCompatActivity {

    private ListView lsvListarTarefas;
    private List<Tarefa> tarefas;
    private FloatingActionButton fabCadastrarTarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_tarefas);

        lsvListarTarefas = (ListView) findViewById(R.id.lsv_listar_tarefas);

        tarefas =  new ArrayList<Tarefa>();

        Tarefa t1 = new Tarefa(1, "Comprar pão");
        Tarefa t2 = new Tarefa(2, "Terminar o how");
        Tarefa t3 = new Tarefa(3, "Levar o lixo");

        tarefas.add(t1);
        tarefas.add(t2);
        tarefas.add(t3);

        ArrayAdapter<Tarefa> adapter = new ArrayAdapter<Tarefa>(this, android.R.layout.simple_list_item_1, tarefas);
        lsvListarTarefas.setAdapter(adapter);
        //fabCadastrarTarefa = (FloatingActionButton) findViewById(R.id.fab_cadastrar_tarefa);

        fabCadastrarTarefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListarTarefasActivity.this, CadastrarTarefaActivity.class);
                startActivity(intent);
            }
        });
    }
}