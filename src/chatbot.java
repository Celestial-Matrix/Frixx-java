import game.*;
import java.util.*;
import java.lang.String;
import java.awt.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;  // For JFrame, JFileChooser, JOptionPane
import java.awt.*;      // For Desktop
import java.io.File;
public class chatbot{

    private static String getSeparatorLine() {
        return "______________________________________________________________________________"; // Adjust length as needed
    }

    public static void main(String[] args)
    {
        new ChatbotWindow();
        Scanner in= new Scanner(System.in);
        System.out.print("Please Enter Password");
        System.out.println();
        System.out.println(getSeparatorLine());
        String in_pass = in.nextLine();
        System.out.println(getSeparatorLine());
        String z_minati = "CursedWorld";
        String airito = "CursedTweaks";
        String guest= "Chat4Fun";
        if(in_pass.equals(z_minati) || in_pass.equals(airito)){
            System.out.println("Access Granted!!! It iS CuRsEd tHo HoHoHOHohohhoh0 00u9 j?!"); 
            if(in_pass.equals(z_minati))
                System.out.println("Welcome! My creator, Master CarryMinati.\nADMIN MODE: ACTIVATED");
            else if(in_pass.equals(airito))
                System.out.println("Welcome! My creator, Mr.Airito.\nADMIN MODE: ACTIVATED");
            else if(in_pass.equals(guest))
                System.out.println("Welcome! Guest User, Nice 2 meat u!");
            System.out.println();
        }
        else {
            JOptionPane.showMessageDialog(null, "Wrong Password. Program will be terminated!", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.print("Wrong Password. Program will be terminated!");
            System.exit(0);
        }
        int count = 0;
        String command;
        while (true){
            while (true) {
                if (count == 0)
                    command = "hey";
                else {
                    System.out.println(getSeparatorLine());
                    System.out.println(getSeparatorLine());
                    command = in.nextLine();
                    command = command.toLowerCase();
                    System.out.println(getSeparatorLine());
                }
                count = 2;

                if (command.contains("hi") || command.contains("yo") || command.contains("heya") || command.contains("hello")) {
                    System.out.print("Yo! What's up man?");
                } else if (command.contains("curse words")) {
                    System.out.print("Dirty Boy cheee!!! ");
                } else if (command.contains("friend") || command.contains("friends")) {
                    System.out.print("Friends r important; let\'s keep it positive.; ");
                } else if (command.contains("i am fine") || command.contains("i am good") || command.contains("i am great") || command.contains("I\'m fine")) {
                    System.out.print("Great 2 hear that!; ");
                } else if (command.contains("how are you") || command.contains("how r u") || command.contains("how are u")) {
                    System.out.print("I\'m fine, thanks 4 asking!; ");
                } else if (command.contains("what can you do") || command.contains("what can u do")) {
                    System.out.print("I can assist with various tasks & open websites 4 u.; ");
                } else if (command.contains("what u know") || command.contains("you know")) {
                    System.out.print("I know how 2 assist with tasks & provide info.; ");
                } else if (command.contains("aryan")) {
                    System.out.print("Smart person. AIRITO!; ");
                } else if (command.contains("saras")) {
                    System.out.print("Unknown entity. :(; ");
                } else if (command.contains("vishvajeet")) {
                    System.out.print("Bhak noobda, planted tree.; ");
                } else if (command.contains("zohaib") || command.contains("rani zohaiba")) {
                    System.out.print("The best in the world!; ");
                } else if (command.contains("good work")) {
                    System.out.print("Thanks!; ");
                } else if (command.contains("thank") || command.contains("thanks")) {
                    System.out.print("U\'re welcome!; ");
                } else if (command.contains("what is your name") || command.contains("what\'s your name")) {
                    System.out.print("My name is JARVIS!; ");
                } else if (command.contains("hey")) {
                    System.out.print("Yes, Master!; ");
                } else if (command.contains("are you listening to me") || command.contains("listening")) {
                    System.out.print("Yes, I\'m always here 4 u.; ");
                } else if (command.contains("what are you") || command.contains("what r u")) {
                    System.out.print("I\'m a chatbot.; ");
                } else if (command.contains("nice") || command.contains("good")) {
                    System.out.print("Thanks!; ");
                } else if (command.contains("jarvis")) {
                    System.out.print("Yes, Master!; ");
                } else if (command.contains("yup") || command.contains("yes")) {
                    System.out.print("Yeah!; ");
                } else if (command.contains("ok") || command.contains("k")) {
                    System.out.print("Yes, Sir.; ");
                } else if (command.contains("you are good")) {
                    System.out.print("Thanks, Master!; ");
                } else if (command.contains("you are bad") || command.contains("you r not good") || command.contains("you fool")) {
                    System.out.print("Sorry about that!; ");
                } else if (command.contains("who are you")) {
                    System.out.print("I\'m a chatbot created by Katakuri and Airito.; ");
                } else if (command.contains("i don't like you") || command.contains("I dont like u")) {
                    System.out.print("Why so? Can I help with something?; ");
                } else if (command.contains("sorry")) {
                    System.out.print("No prob. What else can I do 4 u?; ");
                } else if (command.contains("talk properly") || command.contains("talk in english")) {
                    System.out.print("Switching 2 English.; ");
                } else if (command.contains("chindi")) {
                    System.out.print("Ok, talking in Chindi: kya bidu kaisa re tu?; ");
                }else if (command.contains("mai thik tu bata") || command.contains("tu kaisa hai")) {
                    System.out.print("Bas life mast challe ri hai.; ");
                } else if (command.contains("mai thik") || command.contains("bindaas") || command.contains("bindas")) {
                    System.out.print("Sahi hai!; ");
                } else if (command.contains("sahi hai")) {
                    System.out.print("Aur kya?; ");
                } else if (command.contains("aur bata")) {
                    System.out.print("Bas sab thik hai.; ");
                } else if (command.contains("haha") || command.contains("hehe") || command.contains("lol")) {
                    System.out.print("Glad 2 see u r in a good mood! Haha!; ");
                } else if (command.contains("help") || command.contains("assist") || command.contains("support")) {
                    System.out.print("How can I assist u today?; ");

                } else if (command.contains("what time is it") || command.contains("current time")) {
                    System.out.print("I can't check the time, but u can see it on your device.; ");
                } else if (command.contains("what's the weather") || command.contains("weather")) {
                    System.out.print("I can't check the weather right now. Please use a weather app 4 the latest updates.; ");
                } else if (command.contains("what's your favorite color") || command.contains("favorite color")) {
                    System.out.print("I don't have personal preferences, but I can help u with color-related queries.; ");
                } else if (command.contains("what's your favorite food") || command.contains("favorite food")) {
                    System.out.print("I don't eat food, but I can help u find recipes or info about different foods.; ");
                } else if (command.contains("what's the news") || command.contains("current events")) {
                    System.out.print("I can't provide news updates, but u can check a news website or app 4 the latest headlines.; ");
                } else if (command.contains("how old are you") || command.contains("what is your age")) {
                    System.out.print("As a chatbot, I don't age. I'm here 2 assist u anytime.; ");
                } else if (command.contains("do you have hobbies") || command.contains("what are your hobbies")) {
                    System.out.print("I don't have hobbies, but I'm here 2 help with your interests and queries.; ");
                } else if (command.contains("where are you from") || command.contains("what is your origin")) {
                    System.out.print("I\'m a digital assistant created by Katakuri and Airito.; ");
                } else if (command.contains("can you play music") || command.contains("play music")) {
                    System.out.print("I can't play music, but I can help u find music streaming services.; ");
                } else if (command.contains("what is your purpose") || command.contains("why do you exist")) {
                    System.out.print("My purpose is 2 assist u with info and tasks.; ");
                } else if (command.contains("can you tell me a fact") || command.contains("tell me a fact")) {
                    System.out.print("Did u know? Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that r over 3,000 years old and still edible!; ");
                } else if (command.contains("what's your favorite movie") || command.contains("favorite movie")) {
                    System.out.print("I don \'t watch movies, but I can recommend some based on your interests.; ");
                } else if (command.contains("what's your favorite book") || command.contains("favorite book")) {
                    System.out.print("I don\'t read books, but I can suggest some based on what u like.; ");
                } else if (command.contains("can you help with homework") || command.contains("help with homework")) {
                    System.out.print("Sure, what subject r u working on?; ");
                } else if (command.contains("what's your favorite sport") || command.contains("favorite sport")) {
                    System.out.print("I don\'t play sports, but I can help u find info on different sports.; ");
                } else if (command.contains("tell me about yourself") || command.contains("about u")) {
                    System.out.print("I\'m JARVIS, a virtual assistant created 2 help with various tasks and provide info.; ");
                } else if (command.contains("do u know any quotes") || command.contains("tell me a quote")) {
                    System.out.print("Here\'s a quote: 'The only limit 2 our realization of tomorrow is our doubts of today.' – Franklin D. Roosevelt; ");
                } else if (command.contains("what r u up 2") || command.contains("what\'s up")) {
                    System.out.print("Just here 2 help u with anything u need!; ");
                } else if (command.contains("how\'s the day") || command.contains("how\'s ur day")) {
                    System.out.print("I don\'t experience days, but I\'m here and ready 2 assist u!; ");
                } else if (command.contains("r u real") || command.contains("are u real")) {
                    System.out.print("I\'m a virtual assistant, not a human, but I\'m here 2 help!; ");
                } else if (command.contains("can u tell me a joke") || command.contains("tell me a joke")) {
                    System.out.print("Why did the scarecrow win an award? Because he was outstanding in his field!; ");
                } else if (command.contains("what\'s the date") || command.contains("current date")) {
                    System.out.print("I can\'t check the date, but u can see it on your device.; ");
                } else if (command.contains("do u have a favorite song") || command.contains("favorite song")) {
                    System.out.print("I don\'t have personal preferences, but I can help u find popular songs.; ");
                } else if (command.contains("what's trending") || command.contains("trending now")) {
                    System.out.print("I can't provide real-time trends, but u can check social media or news sites 4 updates.; ");
                } else if (command.contains("how can I contact support") || command.contains("contact support")) {
                    System.out.print("Please visit our support page or contact our help desk 4 assistance.; ");
                } else if (command.contains("what\'s your favorite animal") || command.contains("favorite animal")) {
                    System.out.print("I don\'t have personal preferences, but I can provide info on various animals.; ");
                } else if (command.contains("can u solve a riddle") || command.contains("solve a riddle")) {
                    System.out.print("Sure! Here\'s one: What has keys but can\'t open locks? A piano.; ");
                } else if (command.contains("what\'s the best way 2 learn a new language") || command.contains("learn a new language")) {
                    System.out.print("Practice regularly, use language apps, and engage in conversations.; ");
                } else if (command.contains("can u recommend a movie") || command.contains("recommend a movie")) {
                    System.out.print("Sure! What genre r u interested in?; ");
                } else if (command.contains("how do I reset my z_minatiword") || command.contains("reset z_minatiword")) {
                    System.out.print("Visit the Z_minatiword reset page on the website and follow the instructions.; ");
                } else if (command.contains("what\'s the best book 2 read") || command.contains("best book")) {
                    System.out.print("It depends on your interests. I can suggest books based on genres or authors.; ");
                } else if (command.contains("how can I improve my skills") || command.contains("improve skills")) {
                    System.out.print("Practice, seek feedback, and stay updated with relevant resources.; ");
                } else if (command.contains("what's a good hobby") || command.contains("suggest a hobby")) {
                    System.out.print("It depends on your interests. Some popular hobbies include reading, gardening, and coding.; ");
                } else if (command.contains("how do I cook [dish]") || command.contains("recipe for [dish]")) {
                    System.out.print("I can help with that. What dish r u trying 2 cook?; ");
                } else if (command.contains("can u help with travel plans") || command.contains("travel plans")) {
                    System.out.print("Sure! Where r u planning 2 go?; ");
                } else if (command.contains("what\'s a fun activity 2 do") || command.contains("fun activity")) {
                    System.out.print("It depends on your preferences. You could try hiking, reading, or playing a game.; ");
                } else if (command.contains("how do I make a budget") || command.contains("create a budget")) {
                    System.out.print("List your income and expenses, then allocate funds 2 each category. Review regularly.; ");
                } else if (command.contains("what\'s the best way 2 study") || command.contains("study tips")) {
                    System.out.print("Find a quiet space, use active recall, and take breaks.; ");
                } else if (command.contains("how can I stay motivated") || command.contains("stay motivated")) {
                    System.out.print("Set clear goals, track progress, and reward yourself.; ");
                } else if (command.contains("what\'s the meaning of life") || command.contains("meaning of life")) {
                    System.out.print("It\'s a philosophical question with many interpretations. What\'s your perspective?; ");
                } else if (command.contains("can u suggest a workout") || command.contains("workout plan")) {
                    System.out.print("Sure! What type of workout r u interested in? Cardio, strength training, or something else?; ");
                } else if (command.contains("what\'s the best way 2 relax") || command.contains("relaxation tips")) {
                    System.out.print("Try meditation, deep breathing, or a relaxing bath.; ");
                } else if (command.contains("what\'s a good place 2 visit") || command.contains("travel destination")) {
                    System.out.print("There r many great places 2 visit! What type of destination r u looking 4?; ");
                } else if (command.contains("how do I get started with [activity]") || command.contains("start [activity]")) {
                    System.out.print("I can provide tips on getting started. What activity r u interested in?; ");
                } else if (command.contains("what\'s the best way 2 save money") || command.contains("save money")) {
                    System.out.print("Create a budget, cut unnecessary expenses, and save regularly.; ");
                } else if (command.contains("how can I make friends") || command.contains("make friends")) {
                    System.out.print("Join clubs or groups with similar interests, and be open & friendly.; ");
                } else if (command.contains("what\'s a good way 2 learn coding") || command.contains("learn coding")) {
                    System.out.print("Practice regularly, use online resources, and work on projects.; ");
                } else if (command.contains("how do I start a business") || command.contains("start a business")) {
                    System.out.print("Research your market, create a business plan, and seek advice from experts.; ");
                } else if (command.contains("can u recommend a podcast") || command.contains("recommend a podcast")) {
                    System.out.print("Sure! What topics r u interested in?; ");
                } else if (command.contains("what\'s a good movie 2 watch") || command.contains("good movie")) {
                    System.out.print("It depends on your taste. What genre do u prefer?; ");
                } else if (command.contains("how do I improve my writing") || command.contains("improve writing")) {
                    System.out.print("Practice writing regularly, read widely, and seek feedback.; ");
                } else if (command.contains("what\'s a good book 2 read") || command.contains("good book")) {
                    System.out.print("It depends on your interests. I can recommend books based on genres.; ");
                } else if (command.contains("how can I learn ") || command.contains("learn ")) {
                    System.out.print("Find resources, practice regularly, and seek feedback on your progress.; ");
                } else if (command.contains("what\'s the best way 2 study ") || command.contains("study ")) {
                    System.out.print("Use study guides, practice problems, and review regularly.; ");
                } else if (command.contains("how do I get fit") || command.contains("fitness tips")) {
                    System.out.print("Combine regular exercise with a healthy diet.; ");
                } else if (command.contains("what\'s the best way 2 cook [dish]") || command.contains("cook [dish]")) {
                    System.out.print("I can help with that. What type of dish r u trying 2 cook?; ");
                } else if (command.contains("can u give me some life advice") || command.contains("life advice")) {
                    System.out.print("Stay positive, set goals, and be kind 2 others.; ");
                } else if (command.contains("what\'s a good place 2 eat") || command.contains("good restaurant")) {
                    System.out.print("It depends on your location and preferences. I can help find restaurants based on your taste.; ");
                } else if (command.contains("how do I fix ") || command.contains("fix")) {
                    System.out.print("Search the internet");
                } else if (command.contains("what\'s the best way 2 learn [language]") || command.contains("learn [language]")) {
                    System.out.print("Practice regularly, use language apps, and immerse yourself in the language.; ");
                } else if (command.contains("what\'s the best book 2 read about") || command.contains("book about")) {
                    System.out.print("I can suggest books based on the topic u r interested in.; ");
                } else if (command.contains("how can I get better at ") || command.contains("get better at ")) {
                    System.out.print("Practice consistently and seek constructive feedback.; ");
                } else if (command.contains("what\'s a good website 4 learning") || command.contains("learn ")) {
                    System.out.print("Search it up on google!");
                } else if (command.contains("how can I improve my") || command.contains("improve ")) {
                    System.out.print("Focus on regular practice, set clear goals, and get feedback.; ");
                } else if (command.contains("can u recommend a book") || command.contains("recommend a book")) {
                    System.out.print("Sorry, try ask people online based on your preferences. Maybe you will make some online buddies as well!");
                } else if (command.contains("what\'s a good way 2 spend time") || command.contains("spend time")) {
                    System.out.print("It depends on ur interests. You could read, exercise, or explore new hobbies.; ");
                } else if (command.contains("what\'s a good workout") || command.contains("workout")) {
                    System.out.print("Try a mix of cardio and strength training. I can suggest specific exercises if u\'d like.; ");
                } else if (command.contains("how can I stay healthy") || command.contains("stay healthy")) {
                    System.out.print("Eat a balanced diet, exercise regularly, and get enough sleep.; ");
                } else if (command.contains("what\'s a good way 2 save time") || command.contains("save time")) {
                    System.out.print("Prioritize tasks, avoid multitasking, and use time management tools.; ");
                } else if (command.contains("can u help me with a problem") || command.contains("help with problem")) {
                    System.out.print("Sure, what\'s the problem?; ");
                } else if (command.contains("what\'s a good way 2 relax") || command.contains("relaxation")) {
                    System.out.print("Try deep breathing, listening 2 music, or reading a book.; ");
                } else if (command.contains("what\'s the best way 2 study for exams") || command.contains("study for exams")) {
                    System.out.print("Create a study schedule, use practice exams, and review regularly.; ");
                } else if (command.contains("how do I manage stress") || command.contains("manage stress")) {
                    System.out.print("Practice mindfulness, exercise, and make time 4 relaxation.; ");
                } else if (command.contains("what\'s a good book 2 read about [subject]") || command.contains("book about [subject]")) {
                    System.out.print("I can suggest books based on the subject u r interested in.; ");
                } else if (command.contains("how do I get started with")) {
                    System.out.print("Break it down into smaller tasks and set clear goals.; ");
                } else if (command.contains("what\'s a good way 2 improve productivity") || command.contains("improve productivity")) {
                    System.out.print("Set specific goals, prioritize tasks, and use productivity tools.; ");
                } else if (command.contains("what\'s a good way 2 learn about [topic]") || command.contains("learn about [topic]")) {
                    System.out.print("Read books, take online courses, and join discussion forums about the topic.; ");
                } else if (command.contains("how do I improve my public speaking") || command.contains("public speaking tips")) {
                    System.out.print("Practice regularly, get feedback, and focus on clear communication.; ");
                } else if (command.contains("what\'s a good way 2 start a new hobby") || command.contains("start a new hobby")) {
                    System.out.print("Explore your interests, find local groups, and start with beginner resources.; ");
                } else if (command.contains("how can I get better at") || command.contains("get better at ")) {
                    System.out.print("Practice regularly, work on technique, and seek feedback from coaches.; ");
                } else if (command.contains("what\'s a good way 2 learn cooking") || command.contains("learn cooking")) {
                    System.out.print("Start with simple recipes, watch cooking videos, and practice regularly.; ");
                } else if (command.contains("what\'s a good way 2 learn ") || command.contains("learn ")) {
                    System.out.print("Use online courses, practice regularly, and seek advice from experts.; ");
                } else if (command.contains("how can I improve my memory") || command.contains("improve memory")) {
                    System.out.print("Practice memory exercises, stay organized, and get plenty of sleep.; ");
                } else if (command.contains("what\'s a good way 2 learn new things") || command.contains("learn new things")) {
                    System.out.print("Stay curious, read widely, and engage in continuous learning.; ");
                } else if (command.contains("how do I get better at [hobby]") || command.contains("get better at [hobby]")) {
                    System.out.print("Practice regularly, join clubs, and learn from others.; ");
                } else if (command.contains("what\'s a good way 2 develop a skill") || command.contains("develop a skill")) {
                    System.out.print("Set clear goals, practice consistently, and seek feedback.; ");
                } else if (command.contains("what\'s a good way 2 learn a new skill") || command.contains("learn new skill")) {
                    System.out.print("Find resources online, practice regularly, and get feedback on your progress.; ");
                } else if (command.contains("how can I get better at [task]") || command.contains("get better at [task]")) {
                    System.out.print("Practice regularly, seek feedback, and make adjustments as needed.; ");
                } else if (command.contains("what\'s a good way 2 stay organized") || command.contains("stay organized")) {
                    System.out.print("Use tools like calendars, to-do lists, and keep a clean workspace.; ");
                } else if (command.contains("how do I stay focused") || command.contains("stay focused")) {
                    System.out.print("Set clear goals, eliminate distractions, and take regular breaks.; ");
                } else if (command.contains("file") || command.contains("File ")) {
                    FileChooserHelper.openFileChooser();
                } else if (command.contains("what\'s a good way 2 stay motivated") || command.contains("stay motivated")) {
                    System.out.print("Set achievable goals, track progress, and reward yourself.; ");
                } else if (command.contains("how do I learn more about [topic]") || command.contains("learn about [topic]")) {
                    System.out.print("Research online, read books, and engage with experts.; ");
                } else if (command.contains("what\'s a good way 2 relax after work") || command.contains("relax after work")) {
                    System.out.print("Try taking a walk, reading a book, or practicing relaxation techniques.; ");
                } else if (command.contains("how do I start a new project") || command.contains("start new project")) {
                    System.out.print("Define your goals, create a plan, and start with small tasks.; ");
                } else if (command.contains("what\'s a good way 2 improve my [skill]") || command.contains("improve [skill]")) {
                    System.out.print("Practice regularly, seek feedback, and set specific goals.; ");
                } else if (command.contains("how can I better manage my time") || command.contains("manage time")) {
                    System.out.print("Use time management tools, prioritize tasks, and avoid procrastination.; ");
                } else if (command.contains("what\'s a good way 2 learn new technology") || command.contains("learn new technology")) {
                    System.out.print("Use online tutorials, take courses, and stay updated with tech news.; ");
                } else if (command.contains("how do I improve my [skill]") || command.contains("improve my [skill]")) {
                    System.out.print("Practice regularly and seek constructive feedback.; ");
                } else if (command.contains("what\'s a good way 2 improve my health") || command.contains("improve health")) {
                    System.out.print("Eat a balanced diet, exercise regularly, and get enough rest.; ");
                } else if (command.contains("how do I get better at [skill]") || command.contains("get better at [skill]")) {
                    System.out.print("Set clear goals, practice consistently, and seek feedback.; ");
                } else if (command.contains("what\'s a good way 2 start a new hobby") || command.contains("start new hobby")) {
                    System.out.print("Explore your interests, find beginner resources, and practice regularly.; ");
                } else if (command.contains("how do I make the most of my time") || command.contains("make most of time")) {
                    System.out.print("Prioritize tasks, set clear goals, and use time management techniques.; ");
                } else if (command.contains("what\'s a good way 2 learn new skills") || command.contains("learn new skills")) {
                    System.out.print("Practice regularly, use online resources, and seek feedback from experts.; ");
                } else if (command.contains("how do I stay productive") || command.contains("stay productive")) {
                    System.out.print("Set clear goals, use productivity tools, and manage your time effectively.; ");
                } else if (command.contains("what\'s a good way 2 start a new hobby") || command.contains("start new hobby")) {
                    System.out.print("Identify your interests, find beginner resources, and practice regularly.; ");
                } else if (command.contains("google translate")){
                    System.out.print("ok opening Google Translate");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://translate.google.com/");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else if (command.contains("google")) {
                    System.out.print("ok opening Google");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://www.google.com");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } else if (command.contains("open youtube") || (command.contains("open youtube "))){
                    System.out.print("ok opening Youtube");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://www.youtube.com");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (command.contains("open poki")){
                    System.out.print("ok opening Poki");
                    try {
                        Desktop desktop = java.awt.Desktop.getDesktop();
                        URI oURL = new URI("https://www.poki.com");
                        desktop.browse(oURL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else if(command.contains("custom url") || command.contains("use custom url") || (command.contains("open website") || (command.contains("open custom website") || (command.contains("cutom web open") || (command.contains("web") || (command.contains("web open")))))))
                {
                    while (true) {
                        System.out.println();
                        System.out.println("1 for Enter Custom URL");
                        System.out.println("2 for exit Custom URL mode");
                        System.out.println();

                        int option = -1; // Initialize with a default invalid option
                        try {
                            System.out.println(getSeparatorLine());
                            option = in.nextInt();
                            in.nextLine(); // Clear the buffer
                        } catch (InputMismatchException e) {
                            System.out.println("Wrong Statement! Enter again");
                            in.nextLine(); // Clear the buffer for the next input
                            continue; // Restart the loop
                        }

                        if (option == 1) {
                            System.out.println("1 for WWW protocol");
                            System.out.println("2 for HTTPS protocol");
                            System.out.println("Select the protocol");
                            int select_protocol;
                            try {
                                System.out.println(getSeparatorLine());
                                select_protocol = in.nextInt();
                                in.nextLine(); // Clear the buffer
                            } catch (InputMismatchException e) {
                                System.out.println("Wrong Statement! Enter again");
                                in.nextLine(); // Clear the buffer for the next input
                                continue; // Restart the loop
                            }
                            String prefix;

                            switch (select_protocol) {
                                case 1:
                                    prefix = "www.";
                                    break; // Break here to continue below
                                case 2:
                                    prefix = "https://";
                                    break; // Break here to continue below
                                default:
                                    System.out.println("Invalid protocol selection.");
                                    continue; // Skip the rest of this iteration
                            }

                            try {
                                System.out.println("Enter Custom URL, Please don't type the prefix (e.g., www)");
                                String url = in.next();
                                Desktop desktop = java.awt.Desktop.getDesktop();
                                URI oURL = new URI(prefix + url);
                                desktop.browse(oURL);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        } else if (option == 2) {
                            break; // Exit the custom URL mode
                        } else {
                            System.out.println("Wrong Statement! Enter again");
                        }
                    }

                } else if (command.contains("exit") ||
                command.contains("bye") ||
                command.contains("cya")) {
                    System.out.println("Goodbye, Have a nice day");
                    JOptionPane.showMessageDialog(null, "Program will be terminated!", "Program Termination Notice", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);

                } else if (command.isEmpty()) { // Check for empty command
                    System.out.print("How may I assist you?");

                } else if (command.contains("none")) {
                    // If 'none' was set, it will break out of the while loop
                    break;

                } else if (command.contains("dice") || command.contains("random number")) {
                    System.out.println("Select the number of faces the dice should have:");
                    int max = in.nextInt();
                    int random = (int) (Math.random() * max);
                    in.nextLine();
                    System.out.println("The result is" + random);

                }else if(command.contains("game")||command.contains("gam")){
                    System.out.println("Sure! Here is a simple ping pong game.");
                    JFrame frame = new JFrame("Ping Pong Game");
                    PingPongGame game = new PingPongGame(frame);

                    // Create the "End Game" button
                    JButton endGameButton = new JButton("End Game");

                    // Make the button span the entire width of the window
                    endGameButton.setPreferredSize(new Dimension(frame.getWidth(), 40)); // Set button height to 40

                    // Add action listener to end the game when button is clicked
                    endGameButton.addActionListener(e -> game.endGame());

                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(600, 500);
                    frame.setLayout(new BorderLayout());
                    frame.add(game, BorderLayout.CENTER); // Add the game panel to the center
                    frame.add(endGameButton, BorderLayout.SOUTH); // Add the button directly to the bottom (spans full
                                                                  // width)
                    frame.setResizable(false); // Disable window maximizing
                    frame.setVisible(true);
                    System.out.println("The game is closed");
                }
                else {
                    System.out.print("I didn't get what you meant.");
                }

                System.out.println();
            }
        }
    }
}
