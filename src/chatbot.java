package src;
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
        return "_____________________________________________________________________________"; // Adjust length as needed
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
                    System.out.println(getSeparatorLine());
                }
                count = 2;
                
                if (command.toLowerCase().contains("Hi") || command.toLowerCase().contains("yo") || command.toLowerCase().contains("heya") || command.toLowerCase().contains("hello")) {
                    System.out.print("Yo! What's up man?");
                } else if (command.toLowerCase().contains("curse words")) {
                    System.out.print("Dirty Boy cheee!!! ");
                } else if (command.contains("friend") || command.contains("friends")) {
                    System.out.print("Friends r important; let\'s keep it positive.; ");
                } else if (command.toLowerCase().contains("I am fine") || command.toLowerCase().contains("i am good") || command.toLowerCase().contains("i am great") || command.toLowerCase().contains("I\'m fine")) {
                    System.out.print("Great 2 hear that!; ");
                } else if (command.contains("How are you") || command.contains("How r u") || command.contains("how are u")) {
                    System.out.print("I\'m fine, thanks 4 asking!; ");
                } else if (command.toLowerCase().contains("what can you do") || command.toLowerCase().contains("what can u do")) {
                    System.out.print("I can assist with various tasks & open websites 4 u.; ");
                } else if (command.toLowerCase().contains("what u know") || command.contains("you know")) {
                    System.out.print("I know how 2 assist with tasks & provide info.; ");
                } else if (command.contains("aryan")) {
                    System.out.print("Smart person. AIRITO!; ");
                } else if (command.contains("saras")) {
                    System.out.print("Unknown entity. :(; ");
                } else if (command.contains("vishvajeet")) {
                    System.out.print("Bhak noobda, planted tree.; ");
                } else if (command.contains("zohaib") || command.contains("Rani Zohaiba")) {
                    System.out.print("The best in the world!; ");
                } else if (command.toLowerCase().contains("good work")) {
                    System.out.print("Thanks!; ");
                } else if (command.toLowerCase().contains("Thank")) {
                    System.out.print("U\'re welcome!; ");
                } else if (command.toLowerCase().contains("what is your name") || command.toLowerCase().contains("what\'s your name")) {
                    System.out.print("My name is JARVIS!; ");
                } else if (command.toLowerCase().contains("hey")) {
                    System.out.print("Yes, Master!; ");
                } else if (command.toLowerCase().contains("are you listening to me") || command.contains("listening")) {
                    System.out.print("Yes, I\'m always here 4 u.; ");
                } else if (command.toLowerCase().contains("what are you") || command.toLowerCase().contains("what r u")) {
                    System.out.print("I\'m a chatbot.; ");
                } else if (command.toLowerCase().contains("nice") || command.toLowerCase().contains("good")) {
                    System.out.print("Thanks!; ");
                } else if (command.toLowerCase().contains("jarvis")) {
                    System.out.print("Yes, Master!; ");
                } else if (command.toLowerCase().contains("yup") || command.toLowerCase().contains("yes")) {
                    System.out.print("Yeah!; ");
                } else if (command.toLowerCase().contains("ok") || command.toLowerCase().contains("k")) {
                    System.out.print("Yes, Sir.; ");
                } else if (command.toLowerCase().contains("you are good")) {
                    System.out.print("Thanks, Master!; ");
                } else if (command.toLowerCase().contains("you are bad") || command.toLowerCase().contains("you r not good") || command.toLowerCase().contains("you fool")) {
                    System.out.print("Sorry about that!; ");
                } else if (command.toLowerCase().contains("who are you")) {
                    System.out.print("I\'m a chatbot created by Katakuri and Airito.; ");
                } else if (command.toLowerCase().contains("i don't like you") || command.toLowerCase().contains("I dont like u")) {
                    System.out.print("Why so? Can I help with something?; ");
                } else if (command.toLowerCase().contains("sorry")) {
                    System.out.print("No prob. What else can I do 4 u?; ");
                } else if (command.equalsIgnoreCase("talk properly") || command.toLowerCase().contains("talk in english")) {
                    System.out.print("Switching 2 English.; ");
                } else if (command.equalsIgnoreCase("talk in chindi")) {
                    System.out.print("Ok, talking in Chindi: kya bidu kaisa re tu?; ");
                } else if (command.equalsIgnoreCase("mai thik tu bata") || command.equalsIgnoreCase("tu kaisa hai")) {
                    System.out.print("Bas life mast challe ri hai.; ");
                } else if (command.equalsIgnoreCase("mai thik") || command.equalsIgnoreCase("bindaas") || command.equalsIgnoreCase("bindas")) {
                    System.out.print("Sahi hai!; ");
                } else if (command.equalsIgnoreCase("sahi hai")) {
                    System.out.print("Aur kya?; ");
                } else if (command.equalsIgnoreCase("aur bata")) {
                    System.out.print("Bas sab thik hai.; ");
                } else if (command.toLowerCase().contains("haha") || command.toLowerCase().contains("hehe") || command.toLowerCase().contains("lol")) {
                    System.out.print("Glad 2 see u r in a good mood! Haha!; ");
                } else if (command.toLowerCase().contains("help") || command.contains("assist") || command.contains("support")) {
                    System.out.print("How can I assist u today?; ");

                } else if (command.toLowerCase().contains("what time is it") || command.toLowerCase().contains("current time")) {
                    System.out.print("I can't check the time, but u can see it on your device.; ");
                } else if (command.toLowerCase().contains("what's the weather") || command.toLowerCase().contains("weather")) {
                    System.out.print("I can't check the weather right now. Please use a weather app 4 the latest updates.; ");
                } else if (command.toLowerCase().contains("what's your favorite color") || command.toLowerCase().contains("favorite color")) {
                    System.out.print("I don't have personal preferences, but I can help u with color-related queries.; ");
                } else if (command.toLowerCase().contains("what's your favorite food") || command.toLowerCase().contains("favorite food")) {
                    System.out.print("I don't eat food, but I can help u find recipes or info about different foods.; ");
                } else if (command.toLowerCase().contains("what's the news") || command.toLowerCase().contains("current events")) {
                    System.out.print("I can't provide news updates, but u can check a news website or app 4 the latest headlines.; ");
                } else if (command.toLowerCase().contains("how old are you") || command.toLowerCase().contains("what is your age")) {
                    System.out.print("As a chatbot, I don't age. I'm here 2 assist u anytime.; ");
                } else if (command.toLowerCase().contains("do you have hobbies") || command.toLowerCase().contains("what are your hobbies")) {
                    System.out.print("I don't have hobbies, but I'm here 2 help with your interests and queries.; ");
                } else if (command.toLowerCase().contains("where are you from") || command.toLowerCase().contains("what is your origin")) {
                    System.out.print("I\'m a digital assistant created by Katakuri and Airito.; ");
                } else if (command.toLowerCase().contains("can you play music") || command.toLowerCase().contains("play music")) {
                    System.out.print("I can't play music, but I can help u find music streaming services.; ");
                } else if (command.toLowerCase().contains("what is your purpose") || command.toLowerCase().contains("why do you exist")) {
                    System.out.print("My purpose is 2 assist u with info and tasks.; ");
                } else if (command.toLowerCase().contains("can you tell me a fact") || command.toLowerCase().contains("tell me a fact")) {
                    System.out.print("Did u know? Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that r over 3,000 years old and still edible!; ");
                } else if (command.toLowerCase().contains("what's your favorite movie") || command.toLowerCase().contains("favorite movie")) {
                    System.out.print("I don \'t watch movies, but I can recommend some based on your interests.; ");
                } else if (command.toLowerCase().contains("what's your favorite book") || command.toLowerCase().contains("favorite book")) {
                    System.out.print("I don\'t read books, but I can suggest some based on what u like.; ");
                } else if (command.toLowerCase().contains("can you help with homework") || command.toLowerCase().contains("help with homework")) {
                    System.out.print("Sure, what subject r u working on?; ");
                } else if (command.toLowerCase().contains("what's your favorite sport") || command.toLowerCase().contains("favorite sport")) {
                    System.out.print("I don\'t play sports, but I can help u find info on different sports.; ");
                } else if (command.toLowerCase().contains("tell me about yourself") || command.toLowerCase().contains("about u")) {
                    System.out.print("I\'m JARVIS, a virtual assistant created 2 help with various tasks and provide info.; ");
                } else if (command.toLowerCase().contains("do u know any quotes") || command.toLowerCase().contains("tell me a quote")) {
                    System.out.print("Here\'s a quote: 'The only limit 2 our realization of tomorrow is our doubts of today.' – Franklin D. Roosevelt; ");
                } else if (command.toLowerCase().contains("what r u up 2") || command.toLowerCase().contains("what\'s up")) {
                    System.out.print("Just here 2 help u with anything u need!; ");
                } else if (command.toLowerCase().contains("how\'s the day") || command.toLowerCase().contains("how\'s ur day")) {
                    System.out.print("I don\'t experience days, but I\'m here and ready 2 assist u!; ");
                } else if (command.toLowerCase().contains("r u real") || command.toLowerCase().contains("are u real")) {
                    System.out.print("I\'m a virtual assistant, not a human, but I\'m here 2 help!; ");
                } else if (command.toLowerCase().contains("can u tell me a joke") || command.toLowerCase().contains("tell me a joke")) {
                    System.out.print("Why did the scarecrow win an award? Because he was outstanding in his field!; ");
                } else if (command.toLowerCase().contains("what\'s the date") || command.toLowerCase().contains("current date")) {
                    System.out.print("I can\'t check the date, but u can see it on your device.; ");
                } else if (command.toLowerCase().contains("do u have a favorite song") || command.toLowerCase().contains("favorite song")) {
                    System.out.print("I don\'t have personal preferences, but I can help u find popular songs.; ");
                } else if (command.toLowerCase().contains("what's trending") || command.toLowerCase().contains("trending now")) {
                    System.out.print("I can't provide real-time trends, but u can check social media or news sites 4 updates.; ");
                } else if (command.toLowerCase().contains("how can I contact support") || command.toLowerCase().contains("contact support")) {
                    System.out.print("Please visit our support page or contact our help desk 4 assistance.; ");
                } else if (command.toLowerCase().contains("what\'s your favorite animal") || command.toLowerCase().contains("favorite animal")) {
                    System.out.print("I don\'t have personal preferences, but I can provide info on various animals.; ");
                } else if (command.toLowerCase().contains("can u solve a riddle") || command.toLowerCase().contains("solve a riddle")) {
                    System.out.print("Sure! Here\'s one: What has keys but can\'t open locks? A piano.; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 learn a new language") || command.toLowerCase().contains("learn a new language")) {
                    System.out.print("Practice regularly, use language apps, and engage in conversations.; ");
                } else if (command.toLowerCase().contains("can u recommend a movie") || command.toLowerCase().contains("recommend a movie")) {
                    System.out.print("Sure! What genre r u interested in?; ");
                } else if (command.toLowerCase().contains("how do I reset my Z_minatiword") || command.toLowerCase().contains("reset Z_minatiword")) {
                    System.out.print("Visit the Z_minatiword reset page on the website and follow the instructions.; ");
                } else if (command.toLowerCase().contains("what\'s the best book 2 read") || command.toLowerCase().contains("best book")) {
                    System.out.print("It depends on your interests. I can suggest books based on genres or authors.; ");
                } else if (command.toLowerCase().contains("how can I improve my skills") || command.toLowerCase().contains("improve skills")) {
                    System.out.print("Practice, seek feedback, and stay updated with relevant resources.; ");
                } else if (command.toLowerCase().contains("what's a good hobby") || command.toLowerCase().contains("suggest a hobby")) {
                    System.out.print("It depends on your interests. Some popular hobbies include reading, gardening, and coding.; ");
                } else if (command.toLowerCase().contains("how do I cook [dish]") || command.toLowerCase().contains("recipe for [dish]")) {
                    System.out.print("I can help with that. What dish r u trying 2 cook?; ");
                } else if (command.toLowerCase().contains("can u help with travel plans") || command.toLowerCase().contains("travel plans")) {
                    System.out.print("Sure! Where r u planning 2 go?; ");
                } else if (command.toLowerCase().contains("what\'s a fun activity 2 do") || command.toLowerCase().contains("fun activity")) {
                    System.out.print("It depends on your preferences. You could try hiking, reading, or playing a game.; ");
                } else if (command.toLowerCase().contains("how do I make a budget") || command.toLowerCase().contains("create a budget")) {
                    System.out.print("List your income and expenses, then allocate funds 2 each category. Review regularly.; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 study") || command.toLowerCase().contains("study tips")) {
                    System.out.print("Find a quiet space, use active recall, and take breaks.; ");
                } else if (command.toLowerCase().contains("how can I stay motivated") || command.toLowerCase().contains("stay motivated")) {
                    System.out.print("Set clear goals, track progress, and reward yourself.; ");
                } else if (command.toLowerCase().contains("what\'s the meaning of life") || command.toLowerCase().contains("meaning of life")) {
                    System.out.print("It\'s a philosophical question with many interpretations. What\'s your perspective?; ");
                } else if (command.toLowerCase().contains("can u suggest a workout") || command.toLowerCase().contains("workout plan")) {
                    System.out.print("Sure! What type of workout r u interested in? Cardio, strength training, or something else?; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 relax") || command.toLowerCase().contains("relaxation tips")) {
                    System.out.print("Try meditation, deep breathing, or a relaxing bath.; ");
                } else if (command.toLowerCase().contains("what\'s a good place 2 visit") || command.toLowerCase().contains("travel destination")) {
                    System.out.print("There r many great places 2 visit! What type of destination r u looking 4?; ");
                } else if (command.toLowerCase().contains("how do I get started with [activity]") || command.toLowerCase().contains("start [activity]")) {
                    System.out.print("I can provide tips on getting started. What activity r u interested in?; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 save money") || command.toLowerCase().contains("save money")) {
                    System.out.print("Create a budget, cut unnecessary expenses, and save regularly.; ");
                } else if (command.toLowerCase().contains("how can I make friends") || command.toLowerCase().contains("make friends")) {
                    System.out.print("Join clubs or groups with similar interests, and be open & friendly.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn coding") || command.toLowerCase().contains("learn coding")) {
                    System.out.print("Practice regularly, use online resources, and work on projects.; ");
                } else if (command.toLowerCase().contains("how do I start a business") || command.toLowerCase().contains("start a business")) {
                    System.out.print("Research your market, create a business plan, and seek advice from experts.; ");
                } else if (command.toLowerCase().contains("can u recommend a podcast") || command.toLowerCase().contains("recommend a podcast")) {
                    System.out.print("Sure! What topics r u interested in?; ");
                } else if (command.toLowerCase().contains("what\'s a good movie 2 watch") || command.toLowerCase().contains("good movie")) {
                    System.out.print("It depends on your taste. What genre do u prefer?; ");
                } else if (command.toLowerCase().contains("how do I improve my writing") || command.toLowerCase().contains("improve writing")) {
                    System.out.print("Practice writing regularly, read widely, and seek feedback.; ");
                } else if (command.toLowerCase().contains("what\'s a good book 2 read") || command.toLowerCase().contains("good book")) {
                    System.out.print("It depends on your interests. I can recommend books based on genres.; ");
                } else if (command.toLowerCase().contains("how can I learn [skill]") || command.toLowerCase().contains("learn [skill]")) {
                    System.out.print("Find resources, practice regularly, and seek feedback on your progress.; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 study [subject]") || command.toLowerCase().contains("study [subject]")) {
                    System.out.print("Use study guides, practice problems, and review regularly.; ");
                } else if (command.toLowerCase().contains("how do I get fit") || command.toLowerCase().contains("fitness tips")) {
                    System.out.print("Combine regular exercise with a healthy diet.; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 cook [dish]") || command.toLowerCase().contains("cook [dish]")) {
                    System.out.print("I can help with that. What type of dish r u trying 2 cook?; ");
                } else if (command.toLowerCase().contains("can u give me some life advice") || command.toLowerCase().contains("life advice")) {
                    System.out.print("Stay positive, set goals, and be kind 2 others.; ");
                } else if (command.toLowerCase().contains("what\'s a good place 2 eat") || command.toLowerCase().contains("good restaurant")) {
                    System.out.print("It depends on your location and preferences. I can help find restaurants based on your taste.; ");
                } else if (command.toLowerCase().contains("how do I fix [problem]") || command.toLowerCase().contains("fix [problem]")) {
                    System.out.print("I can help troubleshoot that. What\'s the specific issue?; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 learn [language]") || command.toLowerCase().contains("learn [language]")) {
                    System.out.print("Practice regularly, use language apps, and immerse yourself in the language.; ");
                } else if (command.toLowerCase().contains("what\'s the best book 2 read about [topic]") || command.toLowerCase().contains("book about [topic]")) {
                    System.out.print("I can suggest books based on the topic u r interested in.; ");
                } else if (command.toLowerCase().contains("how can I get better at [skill]") || command.toLowerCase().contains("get better at [skill]")) {
                    System.out.print("Practice consistently and seek constructive feedback.; ");
                } else if (command.toLowerCase().contains("what\'s a good website 4 learning [topic]") || command.toLowerCase().contains("learn [topic]")) {
                    System.out.print("There r many resources online. Let me know the topic, and I can suggest websites.; ");
                } else if (command.toLowerCase().contains("how can I improve my [skill]") || command.toLowerCase().contains("improve [skill]")) {
                    System.out.print("Focus on regular practice, set clear goals, and get feedback.; ");
                } else if (command.toLowerCase().contains("can u recommend a book") || command.toLowerCase().contains("recommend a book")) {
                    System.out.print("Sure! What genre r u interested in?; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 spend time") || command.toLowerCase().contains("spend time")) {
                    System.out.print("It depends on ur interests. You could read, exercise, or explore new hobbies.; ");
                } else if (command.toLowerCase().contains("what\'s a good workout") || command.toLowerCase().contains("workout")) {
                    System.out.print("Try a mix of cardio and strength training. I can suggest specific exercises if u\'d like.; ");
                } else if (command.toLowerCase().contains("how can I stay healthy") || command.toLowerCase().contains("stay healthy")) {
                    System.out.print("Eat a balanced diet, exercise regularly, and get enough sleep.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 save time") || command.toLowerCase().contains("save time")) {
                    System.out.print("Prioritize tasks, avoid multitasking, and use time management tools.; ");
                } else if (command.toLowerCase().contains("can u help me with a problem") || command.toLowerCase().contains("help with problem")) {
                    System.out.print("Sure, what\'s the problem?; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 relax") || command.toLowerCase().contains("relaxation")) {
                    System.out.print("Try deep breathing, listening 2 music, or reading a book.; ");
                } else if (command.toLowerCase().contains("what\'s the best way 2 study for exams") || command.toLowerCase().contains("study for exams")) {
                    System.out.print("Create a study schedule, use practice exams, and review regularly.; ");
                } else if (command.toLowerCase().contains("how do I manage stress") || command.toLowerCase().contains("manage stress")) {
                    System.out.print("Practice mindfulness, exercise, and make time 4 relaxation.; ");
                } else if (command.toLowerCase().contains("what\'s a good book 2 read about [subject]") || command.toLowerCase().contains("book about [subject]")) {
                    System.out.print("I can suggest books based on the subject u r interested in.; ");
                } else if (command.toLowerCase().contains("how do I get started with [project]") || command.toLowerCase().contains("start [project]")) {
                    System.out.print("Break it down into smaller tasks and set clear goals.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 improve productivity") || command.toLowerCase().contains("improve productivity")) {
                    System.out.print("Set specific goals, prioritize tasks, and use productivity tools.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn about [topic]") || command.toLowerCase().contains("learn about [topic]")) {
                    System.out.print("Read books, take online courses, and join discussion forums about the topic.; ");
                } else if (command.toLowerCase().contains("how do I improve my public speaking") || command.toLowerCase().contains("public speaking tips")) {
                    System.out.print("Practice regularly, get feedback, and focus on clear communication.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 start a new hobby") || command.toLowerCase().contains("start a new hobby")) {
                    System.out.print("Explore your interests, find local groups, and start with beginner resources.; ");
                } else if (command.toLowerCase().contains("how can I get better at [sport]") || command.toLowerCase().contains("get better at [sport]")) {
                    System.out.print("Practice regularly, work on technique, and seek feedback from coaches.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn cooking") || command.toLowerCase().contains("learn cooking")) {
                    System.out.print("Start with simple recipes, watch cooking videos, and practice regularly.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn [skill]") || command.toLowerCase().contains("learn [skill]")) {
                    System.out.print("Use online courses, practice regularly, and seek advice from experts.; ");
                } else if (command.toLowerCase().contains("how can I improve my memory") || command.toLowerCase().contains("improve memory")) {
                    System.out.print("Practice memory exercises, stay organized, and get plenty of sleep.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn new things") || command.toLowerCase().contains("learn new things")) {
                    System.out.print("Stay curious, read widely, and engage in continuous learning.; ");
                } else if (command.toLowerCase().contains("how do I get better at [hobby]") || command.toLowerCase().contains("get better at [hobby]")) {
                    System.out.print("Practice regularly, join clubs, and learn from others.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 develop a skill") || command.toLowerCase().contains("develop a skill")) {
                    System.out.print("Set clear goals, practice consistently, and seek feedback.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn a new skill") || command.toLowerCase().contains("learn new skill")) {
                    System.out.print("Find resources online, practice regularly, and get feedback on your progress.; ");
                } else if (command.toLowerCase().contains("how can I get better at [task]") || command.toLowerCase().contains("get better at [task]")) {
                    System.out.print("Practice regularly, seek feedback, and make adjustments as needed.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 stay organized") || command.toLowerCase().contains("stay organized")) {
                    System.out.print("Use tools like calendars, to-do lists, and keep a clean workspace.; ");
                } else if (command.toLowerCase().contains("how do I stay focused") || command.toLowerCase().contains("stay focused")) {
                    System.out.print("Set clear goals, eliminate distractions, and take regular breaks.; ");
                } else if (command.contains("file") || command.contains("File ")) {
                    FileChooserHelper.openFileChooser();
                } else if (command.toLowerCase().contains("what\'s a good way 2 stay motivated") || command.toLowerCase().contains("stay motivated")) {
                    System.out.print("Set achievable goals, track progress, and reward yourself.; ");
                } else if (command.toLowerCase().contains("how do I learn more about [topic]") || command.toLowerCase().contains("learn about [topic]")) {
                    System.out.print("Research online, read books, and engage with experts.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 relax after work") || command.toLowerCase().contains("relax after work")) {
                    System.out.print("Try taking a walk, reading a book, or practicing relaxation techniques.; ");
                } else if (command.toLowerCase().contains("how do I start a new project") || command.toLowerCase().contains("start new project")) {
                    System.out.print("Define your goals, create a plan, and start with small tasks.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 improve my [skill]") || command.toLowerCase().contains("improve [skill]")) {
                    System.out.print("Practice regularly, seek feedback, and set specific goals.; ");
                } else if (command.toLowerCase().contains("how can I better manage my time") || command.toLowerCase().contains("manage time")) {
                    System.out.print("Use time management tools, prioritize tasks, and avoid procrastination.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn new technology") || command.toLowerCase().contains("learn new technology")) {
                    System.out.print("Use online tutorials, take courses, and stay updated with tech news.; ");
                } else if (command.toLowerCase().contains("how do I improve my [skill]") || command.toLowerCase().contains("improve my [skill]")) {
                    System.out.print("Practice regularly and seek constructive feedback.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 improve my health") || command.toLowerCase().contains("improve health")) {
                    System.out.print("Eat a balanced diet, exercise regularly, and get enough rest.; ");
                } else if (command.toLowerCase().contains("how do I get better at [skill]") || command.toLowerCase().contains("get better at [skill]")) {
                    System.out.print("Set clear goals, practice consistently, and seek feedback.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 start a new hobby") || command.toLowerCase().contains("start new hobby")) {
                    System.out.print("Explore your interests, find beginner resources, and practice regularly.; ");
                } else if (command.toLowerCase().contains("how do I make the most of my time") || command.toLowerCase().contains("make most of time")) {
                    System.out.print("Prioritize tasks, set clear goals, and use time management techniques.; ");
                } else if (command.toLowerCase().contains("what\'s a good way 2 learn new skills") || command.toLowerCase().contains("learn new skills")) {
                    System.out.print("Practice regularly, use online resources, and seek feedback from experts.; ");
                } else if (command.toLowerCase().contains("how do I stay productive") || command.toLowerCase().contains("stay productive")) {
                    System.out.print("Set clear goals, use productivity tools, and manage your time effectively.; ");
                } else if (command.toLowerCase().toLowerCase().contains("what\'s a good way 2 start a new hobby") || command.toLowerCase().contains("start new hobby")) {
                    System.out.print("Identify your interests, find beginner resources, and practice regularly.; ");
                } else if (command.toLowerCase().contains("google translate")){
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

                } else if (command.contains("open youtube") || (command.toLowerCase().contains("open youtube "))){
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
                }else if(command.contains("custom url") || command.contains("use custom url") || (command.contains("open website") || (command.toLowerCase().contains("open custom website") || (command.contains("cutom web open") || (command.contains("web") || (command.toLowerCase().contains("web open")))))))
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
                    
                } else if (command.toLowerCase().contains("exit") ||
                        command.toLowerCase().contains("bye") ||
                        command.toLowerCase().contains("cya")) {
                    System.out.println("Goodbye, Have a nice day");
                    JOptionPane.showMessageDialog(null, "Program will be terminated!", "Program Termination Notice", JOptionPane.WARNING_MESSAGE);
                    System.exit(0);

                } else if (command.isEmpty()) { // Check for empty command
                    System.out.print("How may I assist you?");

                } else if (command.contains("none")) {
                    // If 'none' was set, it will break out of the while loop
                    break;

                } else {
                    System.out.print("I didn't get what you meant.");
                }

                System.out.println();
            }
        }
    }
}