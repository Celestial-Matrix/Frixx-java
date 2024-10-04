package src;
import java.util.*;
import java.lang.String;
import java.awt.Desktop;
import java.net.URI;
import java.io.*;
public class chatbot1 
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Please Enter Password");
        System.out.println();
        String in_pass = in.next();
        int go = 1;
        String pass = "CyberTweaks";
        if(in_pass.equals(pass)){
            System.out.print("Access Granted!!!");
            System.out.println();
        }
        else{
            System.out.print("Wrong Password. Program terminated!");
            System.exit(0);
        }
        String command = "hey";
        while (true){

            if(go > 1){
                System.out.print("Me: ");
            }
            else
                go += 1;
            while (true){

                command = in.nextLine();
                System.out.print("Jarvis: ");
                if (command.equalsIgnoreCase("Hi") || command.equalsIgnoreCase("yo") || (command.equalsIgnoreCase("heya"))){
                    System.out.print("Hi, How are you?");
                }else if (command.equalsIgnoreCase("Hello")){
                    System.out.print("Hello, How are you?");
                }else if (command.contains("friend") || command.contains("friends")){
                    System.out.print("dumb people");
                } else if (command.equalsIgnoreCase("I am fine") || (command.equalsIgnoreCase("i am good")) || (command.equalsIgnoreCase("i am great"))){
                    System.out.print("Great to hear that");
                } else if (command.contains("How are you") || (command.contains("How r u"))){
                    System.out.print("I am fine, Thanks for asking!");
                } else if (command.equalsIgnoreCase("what can you do")){
                    System.out.print("i can open some websites for you");
                } else if (command.contains("aryan")){
                    System.out.print("Smart person. AIRITO");
                } else if (command.contains("saras")){
                    System.out.print("unknown entity. :(");
                } else if (command.contains("vishvajeet")){
                    System.out.print("Bhak noobda, planted tree");
                } else if (command.contains("Zohaib")){
                    System.out.print("The best in the world");
                } else if (command.equalsIgnoreCase("good work")){
                    System.out.print("Thank you sir!");
                } else if (command.equalsIgnoreCase("Thanks")){
                    System.out.print("Your welcome!");
                } else if (command.equalsIgnoreCase("what is your name")){
                    System.out.print("My name is JARVIS sir!");
                }else if (command.equalsIgnoreCase("hey")){
                    System.out.print("Yes Master!");
                }else if (command.equalsIgnoreCase("are you listening to me")){
                    System.out.print("yup! I am always here for you.");
                }else if (command.equalsIgnoreCase("what are you") || (command.equalsIgnoreCase("what are you?"))){
                    System.out.print("i am a chatbot");
                }else if (command.equalsIgnoreCase("nice") || (command.equalsIgnoreCase("good"))){
                    System.out.print("Thanks!");
                }else if (command.equalsIgnoreCase("jarvis")){
                    System.out.print("yes master!");
                }else if (command.equalsIgnoreCase("yup")){
                    System.out.print("yeah!");
                }else if (command.equalsIgnoreCase("ok")|| (command.equalsIgnoreCase("k"))){
                    System.out.print("Yes Sir");
                }else if (command.equalsIgnoreCase("you are good")){
                    System.out.print("Thanks master!");
                }else if (command.equalsIgnoreCase("you are bad") || (command.equalsIgnoreCase("you are not good") || (command.equalsIgnoreCase("you fool")))){
                    System.out.print("sorry for that!");
                }else if (command.equalsIgnoreCase("who are you")){
                    System.out.print("i am a chatbot created by ZJava");
                }else if (command.equalsIgnoreCase("i dont like you") || (command.equalsIgnoreCase("I don't like you"))){
                    System.out.print("kya bidu zyada shaana banrela hai!");
                }else if (command.equalsIgnoreCase("sorry")){
                    System.out.print("chal thik maaf kiya /n" + "Bol kya chahiye tereko");
                }else if (command.equalsIgnoreCase("talk properly") || (command.equalsIgnoreCase("talk in english"))){
                    System.out.print("ok!Language changing to english");
                }else if (command.equalsIgnoreCase("talk in chindi")){
                    System.out.print("ok talking in chindi \n"+"kya bidu kaisa re tu");
                }else if (command.equalsIgnoreCase("mai thik tu bata") || (command.equalsIgnoreCase("tu kaisa hai"))){
                    System.out.print("bas life mast challe ri hai");
                }else if (command.equalsIgnoreCase("mai thik") || (command.equalsIgnoreCase("bindaas") || (command.equalsIgnoreCase("bindas")))){
                    System.out.print("sahi hai!");
                }else if (command.equalsIgnoreCase("sahi hai")){
                    System.out.print("aur kya");
                }else if (command.equalsIgnoreCase("aur bata")){
                    System.out.print("bas sab thik hai");
                } else if (command.contains("open google")){
                    System.out.print("ok opening google");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://www.google.com");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else if (command.contains("open youtube") || (command.equalsIgnoreCase("open youtube "))){
                    System.out.print("ok opening youtube");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://www.youtube.com");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (command.contains("open poki")){
                    System.out.print("ok opening poki");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://www.poki.com");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else if(command.contains("use custom url") || (command.contains("open website") || (command.equalsIgnoreCase("open custom website") || (command.contains("cutom web open") || (command.contains("web") || (command.equalsIgnoreCase("web open")))))))
                {
                    while(true){
                        System.out.print("1 for Enter Custom URL");
                        System.out.print("2 for exit Custom URL mode");
                        int option = in.nextInt();
                        if(option == 1){
                            System.out.print("1 for WWW protocol");
                            System.out.print("2 for HTTPS protocol");
                            System.out.print("Select the protocol");
                            int select_protocol = in.nextInt();
                            String p;
                            switch(select_protocol)
                            {
                                case 1:
                                    p = "www.";
                                    try {
                                        System.out.print("Enter Custom URL, Please don't type the prefix (e.g. www)");
                                        String url = in.next();
                                        Desktop desktop = java.awt.Desktop.getDesktop();
                                        URI oURL = new URI(p + url);
                                        desktop.browse(oURL);
                                    } 
                                    catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;

                                case 2:
                                    p = "https://";
                                    try {
                                        System.out.print("Enter Custom URL");
                                        String url = in.next();
                                        Desktop desktop = java.awt.Desktop.getDesktop();
                                        URI oURL = new URI(p + url);
                                        desktop.browse(oURL);
                                    } 
                                    catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    break;
                            }  
                        }
                        else if (option == 2){
                            break; 
                        }
                        else{
                            System.out.print("Wrong Statement! Enter again");
                        }
                    }
                }

                else if (command.contains("exit") || (command.contains("bye") || (command.contains("cya") || (command.equalsIgnoreCase("bye"))))){
                    System.out.println("Goodbye, Have a nice day");
                    System.exit(0);
                }
                else if (command.contains("open application"))
                {
                    Runtime runtime = Runtime.getRuntime();  
                    String file_path = in.next();
                    try
                    {
                        runtime.exec("C:\\Program Files (x86)\\"+file_path+".exe");     

                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
                else if (command == ""){
                    System.out.print("How may i assist you?");
                }
                else{
                    System.out.print("I didn't get what you meant.");
                }
                System.out.println();
                break;
            }
        }
    }
}