package ThePresenceOfaCycleOfKLength;
import com.mathsystem.api.graph.oldmodel.AbstractGraph;

/*
    Псевдокод для ориентированного графа (первый вариант)

    Инициализация:
    CycleLength - длина цикла
    Start - первая вершина для обхода
    Used - список вершиг, проверенных на отсутствие циклов длины CycleLength

    Структура вершин для агоритма Vertexes:
        Ver - вершина (стандартный класс Зайкова)
        Hit - сколько раз вошли в вершину
        Source - откуда попали, если попали один раз

    Цикл по списку вершин графа (Start - текущая вершина):
        Queue - очередь вершин структуры Vertexes
        Цикл по исходящим ребрам Start(V - ребро на рассмотрении):
            W = V.ребро(Start)
            Queue <- Vertexes(Ver = W, Hit = 1, Source = Start)
        Цикл длины CycleLength - 1:
            QueueLength - длина очереди на момент начала итерации
            Цикл длины QueueLength:
                Queue -> U
                Цикл по ребрам U:
                    W = ребро(U)
                    Если W не входит в Used и не равно Start:
                        Если U.Hit != 1:
                            Если элемента, у которого Ver == W нет в Queue:
                                Queue <- Vertexes(Ver = W, Hit = 1, Source = U)
                            Иначе:
                                Изменяем параметры элемента в Queue на Vertexes(Ver = W, Hit = Hit+1, Sources = NULL)
                        Иначе:
                            Если W != U.Source:
                                Если элемента, у которого Ver == W нет в Queue:
                                    Queue <- Vertexes(Ver = W, Hit = 1, Source = U)
                                Иначе:
                                    Изменяем параметры элемента в Queue на Vertexes(Ver = W, Hit = Hit+1, Sources = NULL)
        Пока Queue не пуст:
            Queue -> U
            Цикл по ребрам U:
                Если ребро(U.Ver) == Start:
                    Заканчиваем работу программы и выводим "Успех"
            Used <- Start
    Заканчваем работу и выводим "Провал"
 */

public class MyTask extends AbstractGraph {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
