package DesignPattern.Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) throws IOException {
        YouTube channel=new YouTube();
        subscriber aman=new subscriber("Aman");
        subscriber raman=new subscriber("Raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

        channel.newVideoUploaded("Observer Design Pattern");
        channel.newVideoUploaded("Core Java Course");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to upload new Video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to delete a Subscriber");
            System.out.println("Press 4 to exit");

            int c=Integer.parseInt(br.readLine());
            if(c==1){
                //upload new video
                System.out.println("Enter the title of new Video");
                String title=br.readLine();
                channel.newVideoUploaded(title);

            }else if(c==2){
                //create new Subscriber
                System.out.println("Enter the name of new Subscriber");
                String name=br.readLine();
                observer subscriber=new subscriber(name);
                channel.subscribe(subscriber);
            }else if(c==3){
                System.out.println("Enter the name of Subscriber");
                String name=br.readLine();
                observer subscriber=new subscriber(name);
                channel.unsubscribe(subscriber);
                System.out.println("Subscriber deleted Successfully.");
            }else if(c==4){
                //exit
                System.out.println("Thanks for Using the application...");
                break;
            }else{
                System.out.println("Wrong input");
            }
        }
    }
}
