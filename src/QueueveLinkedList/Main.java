package QueueveLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
        *Queue (kuyruk) Interface'ini iplemente eden LinkedList Class'ı FIFO (First in, First out) mantığıyla çalışır.
        * Add (eleman) Elemanı kuyruğa ekler. Ekleyemezse hata verir.
        * Offer ( eleman) Elemanı kuyruğa ekler. Eklerse true, ekleyemezse false döner.
        * Remove() Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata verir.
        * Poll() Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
        * Element() Kuyruğun en başındaki elemanı döner. Kuyruk boşsa hata verir.
        * Peek() Kuyruğun en başındaki elemanı döner. Kuyruk boşsa null referans döner.
         */
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());

        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        //System.out.println(queue.peek());

        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println("********************************");
        //System.out.println("Eleman çıkarılıyor: " + queue.poll());
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor: " + queue.poll());
        }

    }
}
