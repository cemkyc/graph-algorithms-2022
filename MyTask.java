import com.mathsystem.api.graph.oldmodel.AbstractEdge;
import com.mathsystem.api.graph.oldmodel.AbstractGraph;
import com.mathsystem.domain.plugin.plugintype.GraphProperty;

import java.util.ArrayList;

//import com.mathsystem.graphapi.AbstractGraph;


public abstract class MyTask implements GraphProperty {
    public int execute(AbstractGraph abstractGraph) {

        ArrayList<AbstractEdge> M = new ArrayList<>();

        ArrayList<AbstractEdge> Edges = new ArrayList<>();

        System.out.println(abstractGraph.getEdgeCount());

        //тут типо составлчем массив ребер


        // сортируем массив по возрастанию суммы степеней вершин ребер
        int t, r;
        boolean isSorted = false;
        AbstractEdge buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < Edges.toArray().length - 1; i++) {
                AbstractEdge a1 = Edges.get(i);
                AbstractEdge a2 = Edges.get(i + 1);
                t = a1.getV().getEdgeList().toArray().length + a1.getW().getEdgeList().toArray().length;
                r = a2.getV().getEdgeList().toArray().length + a2.getW().getEdgeList().toArray().length;
                if (t > r) {
                    isSorted = false;
                    buf = a1;
                    Edges.set(i, a2);
                    Edges.set(i + 1, buf);
                }
            }
        }
        int m = 0;
        AbstractEdge temp;
        for (int i = 0; i < Edges.toArray().length; i++) {
            temp = Edges.get(i);
            M.set(m, temp);
            m++;
            //тут будет удаление из списка ребер смежных с ней

        }

        AbstractEdge temp2; //вершина которая на данный момент обрабатывается
        //промежуточное действие в цикле обработки дорабьотаь
        ArrayList<AbstractEdge> g = (ArrayList<AbstractEdge>) temp2.getV().getEdgeList();
        ArrayList<AbstractEdge> f = (ArrayList<AbstractEdge>) temp2.getV().getEdgeList();
        ArrayList<AbstractEdge> result = null;
        result.addAll(g);
        result.addAll(f);
        Edges.removeAll(result);

        return 0;


    }
}
