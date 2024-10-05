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
public class chatbot
{
    public static void main(String[] args)
    {
        new ChatbotWindow();
        Scanner in= new Scanner(System.in);
        System.out.print("Please Enter Password");
        System.out.println();
        String in_pass = in.nextLine();
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
            System.out.print("Wrong Password. Program terminated!");
            System.exit(0);
        }
        int count = 0;
        String command;
        while (true){
            while (true) {
                if (count == 0)
                    command = "hey";
                else {
                    System.out.print("Me: ");
                    command = in.nextLine();
                }
                count = 2;

                if (command.equalsIgnoreCase("Hi") || command.equalsIgnoreCase("yo") || command.equalsIgnoreCase("heya") || command.equalsIgnoreCase("hello")) {
                    System.out.print("Yo! What's up man?");
                } else if (command.equalsIgnoreCase("curse words")) {
                    System.out.print("Dirty Boy cheee!!! ");
                } else if (command.contains("friend") || command.contains("friends")) {
                    System.out.print("Friends r important; let’s keep it positive.; ");
                } else if (command.equalsIgnoreCase("I am fine") || command.equalsIgnoreCase("i am good") || command.equalsIgnoreCase("i am great") || command.equalsIgnoreCase("I’m fine")) {
                    System.out.print("Great 2 hear that!; ");
                } else if (command.contains("How are you") || command.contains("How r u") || command.contains("how are u")) {
                    System.out.print("I’m fine, thanks 4 asking!; ");
                } else if (command.equalsIgnoreCase("what can you do") || command.equalsIgnoreCase("what can u do")) {
                    System.out.print("I can assist with various tasks & open websites 4 u.; ");
                } else if (command.equalsIgnoreCase("what u know") || command.contains("you know")) {
                    System.out.print("I know how 2 assist with tasks & provide info.; ");
                } else if (command.contains("aryan")) {
                    System.out.print("Smart person. AIRITO!; ");
                } else if (command.contains("saras")) {
                    System.out.print("Unknown entity. :(; ");
                } else if (command.contains("vishvajeet")) {
                    System.out.print("Bhak noobda, planted tree.; ");
                } else if (command.contains("zohaib") || command.contains("Rani Zohaiba")) {
                    System.out.print("The best in the world!; ");
                } else if (command.equalsIgnoreCase("good work")) {
                    System.out.print("Thanks!; ");
                } else if (command.equalsIgnoreCase("Thanks") || command.equalsIgnoreCase("thank u")) {
                    System.out.print("U’re welcome!; ");
                } else if (command.equalsIgnoreCase("what is your name") || command.equalsIgnoreCase("what’s your name")) {
                    System.out.print("My name is JARVIS!; ");
                } else if (command.equalsIgnoreCase("hey")) {
                    System.out.print("Yes, Master!; ");
                } else if (command.equalsIgnoreCase("are you listening to me")) {
                    System.out.print("Yes, I’m always here 4 u.; ");
                } else if (command.equalsIgnoreCase("what are you") || command.equalsIgnoreCase("what r u")) {
                    System.out.print("I’m a chatbot.; ");
                } else if (command.equalsIgnoreCase("nice") || command.equalsIgnoreCase("good")) {
                    System.out.print("Thanks!; ");
                } else if (command.equalsIgnoreCase("jarvis")) {
                    System.out.print("Yes, Master!; ");
                } else if (command.equalsIgnoreCase("yup") || command.equalsIgnoreCase("yes")) {
                    System.out.print("Yeah!; ");
                } else if (command.equalsIgnoreCase("ok") || command.equalsIgnoreCase("k")) {
                    System.out.print("Yes, Sir.; ");
                } else if (command.equalsIgnoreCase("you are good")) {
                    System.out.print("Thanks, Master!; ");
                } else if (command.equalsIgnoreCase("you are bad") || command.equalsIgnoreCase("you r not good") || command.equalsIgnoreCase("you fool")) {
                    System.out.print("Sorry about that!; ");
                } else if (command.equalsIgnoreCase("who are you")) {
                    System.out.print("I’m a chatbot created by ZJava.; ");
                } else if (command.equalsIgnoreCase("i don't like you") || command.equalsIgnoreCase("I dont like u")) {
                    System.out.print("Why so? Can I help with something?; ");
                } else if (command.equalsIgnoreCase("sorry")) {
                    System.out.print("No prob. What else can I do 4 u?; ");
                } else if (command.equalsIgnoreCase("talk properly") || command.equalsIgnoreCase("talk in english")) {
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
                } else if (command.equalsIgnoreCase("haha") || command.equalsIgnoreCase("hehe") || command.equalsIgnoreCase("lol")) {
                    System.out.print("Glad 2 see u r in a good mood! Haha!; ");
                } else if (command.equalsIgnoreCase("help") || command.contains("assist") || command.contains("support")) {
                    System.out.print("How can I assist u today?; ");

                } else if (command.equalsIgnoreCase("what time is it") || command.equalsIgnoreCase("current time")) {
                    System.out.print("I can't check the time, but u can see it on your device.; ");
                } else if (command.equalsIgnoreCase("what's the weather") || command.equalsIgnoreCase("weather")) {
                    System.out.print("I can't check the weather right now. Please use a weather app 4 the latest updates.; ");
                } else if (command.equalsIgnoreCase("what's your favorite color") || command.equalsIgnoreCase("favorite color")) {
                    System.out.print("I don't have personal preferences, but I can help u with color-related queries.; ");
                } else if (command.equalsIgnoreCase("what's your favorite food") || command.equalsIgnoreCase("favorite food")) {
                    System.out.print("I don't eat food, but I can help u find recipes or info about different foods.; ");
                } else if (command.equalsIgnoreCase("what's the news") || command.equalsIgnoreCase("current events")) {
                    System.out.print("I can't provide news updates, but u can check a news website or app 4 the latest headlines.; ");
                } else if (command.equalsIgnoreCase("how old are you") || command.equalsIgnoreCase("what is your age")) {
                    System.out.print("As a chatbot, I don't age. I'm here 2 assist u anytime.; ");
                } else if (command.equalsIgnoreCase("do you have hobbies") || command.equalsIgnoreCase("what are your hobbies")) {
                    System.out.print("I don't have hobbies, but I'm here 2 help with your interests and queries.; ");
                } else if (command.equalsIgnoreCase("where are you from") || command.equalsIgnoreCase("what is your origin")) {
                    System.out.print("I’m a digital assistant created by ZJava.; ");
                } else if (command.equalsIgnoreCase("can you play music") || command.equalsIgnoreCase("play music")) {
                    System.out.print("I can't play music, but I can help u find music streaming services.; ");
                } else if (command.equalsIgnoreCase("what is your purpose") || command.equalsIgnoreCase("why do you exist")) {
                    System.out.print("My purpose is 2 assist u with info and tasks.; ");
                } else if (command.equalsIgnoreCase("can you tell me a fact") || command.equalsIgnoreCase("tell me a fact")) {
                    System.out.print("Did u know? Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that r over 3,000 years old and still edible!; ");
                } else if (command.equalsIgnoreCase("what's your favorite movie") || command.equalsIgnoreCase("favorite movie")) {
                    System.out.print("I don’t watch movies, but I can recommend some based on your interests.; ");
                } else if (command.equalsIgnoreCase("what's your favorite book") || command.equalsIgnoreCase("favorite book")) {
                    System.out.print("I don’t read books, but I can suggest some based on what u like.; ");
                } else if (command.equalsIgnoreCase("can you help with homework") || command.equalsIgnoreCase("help with homework")) {
                    System.out.print("Sure, what subject r u working on?; ");
                } else if (command.equalsIgnoreCase("what's your favorite sport") || command.equalsIgnoreCase("favorite sport")) {
                    System.out.print("I don’t play sports, but I can help u find info on different sports.; ");
                } else if (command.equalsIgnoreCase("tell me about yourself") || command.equalsIgnoreCase("about u")) {
                    System.out.print("I’m JARVIS, a virtual assistant created 2 help with various tasks and provide info.; ");
                } else if (command.equalsIgnoreCase("do u know any quotes") || command.equalsIgnoreCase("tell me a quote")) {
                    System.out.print("Here’s a quote: 'The only limit 2 our realization of tomorrow is our doubts of today.' – Franklin D. Roosevelt; ");
                } else if (command.equalsIgnoreCase("what r u up 2") || command.equalsIgnoreCase("what’s up")) {
                    System.out.print("Just here 2 help u with anything u need!; ");
                } else if (command.equalsIgnoreCase("how’s the day") || command.equalsIgnoreCase("how’s ur day")) {
                    System.out.print("I don’t experience days, but I’m here and ready 2 assist u!; ");
                } else if (command.equalsIgnoreCase("r u real") || command.equalsIgnoreCase("are u real")) {
                    System.out.print("I’m a virtual assistant, not a human, but I’m here 2 help!; ");
                } else if (command.equalsIgnoreCase("can u tell me a joke") || command.equalsIgnoreCase("tell me a joke")) {
                    System.out.print("Why did the scarecrow win an award? Because he was outstanding in his field!; ");
                } else if (command.equalsIgnoreCase("what’s the date") || command.equalsIgnoreCase("current date")) {
                    System.out.print("I can’t check the date, but u can see it on your device.; ");
                } else if (command.equalsIgnoreCase("do u have a favorite song") || command.equalsIgnoreCase("favorite song")) {
                    System.out.print("I don’t have personal preferences, but I can help u find popular songs.; ");
                } else if (command.equalsIgnoreCase("what's trending") || command.equalsIgnoreCase("trending now")) {
                    System.out.print("I can't provide real-time trends, but u can check social media or news sites 4 updates.; ");
                } else if (command.equalsIgnoreCase("how can I contact support") || command.equalsIgnoreCase("contact support")) {
                    System.out.print("Please visit our support page or contact our help desk 4 assistance.; ");
                } else if (command.equalsIgnoreCase("what’s your favorite animal") || command.equalsIgnoreCase("favorite animal")) {
                    System.out.print("I don’t have personal preferences, but I can provide info on various animals.; ");
                } else if (command.equalsIgnoreCase("can u solve a riddle") || command.equalsIgnoreCase("solve a riddle")) {
                    System.out.print("Sure! Here’s one: What has keys but can’t open locks? A piano.; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 learn a new language") || command.equalsIgnoreCase("learn a new language")) {
                    System.out.print("Practice regularly, use language apps, and engage in conversations.; ");
                } else if (command.equalsIgnoreCase("can u recommend a movie") || command.equalsIgnoreCase("recommend a movie")) {
                    System.out.print("Sure! What genre r u interested in?; ");
                } else if (command.equalsIgnoreCase("how do I reset my Z_minatiword") || command.equalsIgnoreCase("reset Z_minatiword")) {
                    System.out.print("Visit the Z_minatiword reset page on the website and follow the instructions.; ");
                } else if (command.equalsIgnoreCase("what’s the best book 2 read") || command.equalsIgnoreCase("best book")) {
                    System.out.print("It depends on your interests. I can suggest books based on genres or authors.; ");
                } else if (command.equalsIgnoreCase("how can I improve my skills") || command.equalsIgnoreCase("improve skills")) {
                    System.out.print("Practice, seek feedback, and stay updated with relevant resources.; ");
                } else if (command.equalsIgnoreCase("what's a good hobby") || command.equalsIgnoreCase("suggest a hobby")) {
                    System.out.print("It depends on your interests. Some popular hobbies include reading, gardening, and coding.; ");
                } else if (command.equalsIgnoreCase("how do I cook [dish]") || command.equalsIgnoreCase("recipe for [dish]")) {
                    System.out.print("I can help with that. What dish r u trying 2 cook?; ");
                } else if (command.equalsIgnoreCase("can u help with travel plans") || command.equalsIgnoreCase("travel plans")) {
                    System.out.print("Sure! Where r u planning 2 go?; ");
                } else if (command.equalsIgnoreCase("what’s a fun activity 2 do") || command.equalsIgnoreCase("fun activity")) {
                    System.out.print("It depends on your preferences. You could try hiking, reading, or playing a game.; ");
                } else if (command.equalsIgnoreCase("how do I make a budget") || command.equalsIgnoreCase("create a budget")) {
                    System.out.print("List your income and expenses, then allocate funds 2 each category. Review regularly.; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 study") || command.equalsIgnoreCase("study tips")) {
                    System.out.print("Find a quiet space, use active recall, and take breaks.; ");
                } else if (command.equalsIgnoreCase("how can I stay motivated") || command.equalsIgnoreCase("stay motivated")) {
                    System.out.print("Set clear goals, track progress, and reward yourself.; ");
                } else if (command.equalsIgnoreCase("what’s the meaning of life") || command.equalsIgnoreCase("meaning of life")) {
                    System.out.print("It’s a philosophical question with many interpretations. What’s your perspective?; ");
                } else if (command.equalsIgnoreCase("can u suggest a workout") || command.equalsIgnoreCase("workout plan")) {
                    System.out.print("Sure! What type of workout r u interested in? Cardio, strength training, or something else?; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 relax") || command.equalsIgnoreCase("relaxation tips")) {
                    System.out.print("Try meditation, deep breathing, or a relaxing bath.; ");
                } else if (command.equalsIgnoreCase("what’s a good place 2 visit") || command.equalsIgnoreCase("travel destination")) {
                    System.out.print("There r many great places 2 visit! What type of destination r u looking 4?; ");
                } else if (command.equalsIgnoreCase("how do I get started with [activity]") || command.equalsIgnoreCase("start [activity]")) {
                    System.out.print("I can provide tips on getting started. What activity r u interested in?; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 save money") || command.equalsIgnoreCase("save money")) {
                    System.out.print("Create a budget, cut unnecessary expenses, and save regularly.; ");
                } else if (command.equalsIgnoreCase("how can I make friends") || command.equalsIgnoreCase("make friends")) {
                    System.out.print("Join clubs or groups with similar interests, and be open & friendly.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn coding") || command.equalsIgnoreCase("learn coding")) {
                    System.out.print("Practice regularly, use online resources, and work on projects.; ");
                } else if (command.equalsIgnoreCase("how do I start a business") || command.equalsIgnoreCase("start a business")) {
                    System.out.print("Research your market, create a business plan, and seek advice from experts.; ");
                } else if (command.equalsIgnoreCase("can u recommend a podcast") || command.equalsIgnoreCase("recommend a podcast")) {
                    System.out.print("Sure! What topics r u interested in?; ");
                } else if (command.equalsIgnoreCase("what’s a good movie 2 watch") || command.equalsIgnoreCase("good movie")) {
                    System.out.print("It depends on your taste. What genre do u prefer?; ");
                } else if (command.equalsIgnoreCase("how do I improve my writing") || command.equalsIgnoreCase("improve writing")) {
                    System.out.print("Practice writing regularly, read widely, and seek feedback.; ");
                } else if (command.equalsIgnoreCase("what’s a good book 2 read") || command.equalsIgnoreCase("good book")) {
                    System.out.print("It depends on your interests. I can recommend books based on genres.; ");
                } else if (command.equalsIgnoreCase("how can I learn [skill]") || command.equalsIgnoreCase("learn [skill]")) {
                    System.out.print("Find resources, practice regularly, and seek feedback on your progress.; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 study [subject]") || command.equalsIgnoreCase("study [subject]")) {
                    System.out.print("Use study guides, practice problems, and review regularly.; ");
                } else if (command.equalsIgnoreCase("how do I get fit") || command.equalsIgnoreCase("fitness tips")) {
                    System.out.print("Combine regular exercise with a healthy diet.; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 cook [dish]") || command.equalsIgnoreCase("cook [dish]")) {
                    System.out.print("I can help with that. What type of dish r u trying 2 cook?; ");
                } else if (command.equalsIgnoreCase("can u give me some life advice") || command.equalsIgnoreCase("life advice")) {
                    System.out.print("Stay positive, set goals, and be kind 2 others.; ");
                } else if (command.equalsIgnoreCase("what’s a good place 2 eat") || command.equalsIgnoreCase("good restaurant")) {
                    System.out.print("It depends on your location and preferences. I can help find restaurants based on your taste.; ");
                } else if (command.equalsIgnoreCase("how do I fix [problem]") || command.equalsIgnoreCase("fix [problem]")) {
                    System.out.print("I can help troubleshoot that. What’s the specific issue?; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 learn [language]") || command.equalsIgnoreCase("learn [language]")) {
                    System.out.print("Practice regularly, use language apps, and immerse yourself in the language.; ");
                } else if (command.equalsIgnoreCase("what’s the best book 2 read about [topic]") || command.equalsIgnoreCase("book about [topic]")) {
                    System.out.print("I can suggest books based on the topic u r interested in.; ");
                } else if (command.equalsIgnoreCase("how can I get better at [skill]") || command.equalsIgnoreCase("get better at [skill]")) {
                    System.out.print("Practice consistently and seek constructive feedback.; ");
                } else if (command.equalsIgnoreCase("what’s a good website 4 learning [topic]") || command.equalsIgnoreCase("learn [topic]")) {
                    System.out.print("There r many resources online. Let me know the topic, and I can suggest websites.; ");
                } else if (command.equalsIgnoreCase("how can I improve my [skill]") || command.equalsIgnoreCase("improve [skill]")) {
                    System.out.print("Focus on regular practice, set clear goals, and get feedback.; ");
                } else if (command.equalsIgnoreCase("can u recommend a book") || command.equalsIgnoreCase("recommend a book")) {
                    System.out.print("Sure! What genre r u interested in?; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 spend time") || command.equalsIgnoreCase("spend time")) {
                    System.out.print("It depends on ur interests. You could read, exercise, or explore new hobbies.; ");
                } else if (command.equalsIgnoreCase("what’s a good workout") || command.equalsIgnoreCase("workout")) {
                    System.out.print("Try a mix of cardio and strength training. I can suggest specific exercises if u’d like.; ");
                } else if (command.equalsIgnoreCase("how can I stay healthy") || command.equalsIgnoreCase("stay healthy")) {
                    System.out.print("Eat a balanced diet, exercise regularly, and get enough sleep.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 save time") || command.equalsIgnoreCase("save time")) {
                    System.out.print("Prioritize tasks, avoid multitasking, and use time management tools.; ");
                } else if (command.equalsIgnoreCase("can u help me with a problem") || command.equalsIgnoreCase("help with problem")) {
                    System.out.print("Sure, what’s the problem?; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 relax") || command.equalsIgnoreCase("relaxation")) {
                    System.out.print("Try deep breathing, listening 2 music, or reading a book.; ");
                } else if (command.equalsIgnoreCase("what’s the best way 2 study for exams") || command.equalsIgnoreCase("study for exams")) {
                    System.out.print("Create a study schedule, use practice exams, and review regularly.; ");
                } else if (command.equalsIgnoreCase("how do I manage stress") || command.equalsIgnoreCase("manage stress")) {
                    System.out.print("Practice mindfulness, exercise, and make time 4 relaxation.; ");
                } else if (command.equalsIgnoreCase("what’s a good book 2 read about [subject]") || command.equalsIgnoreCase("book about [subject]")) {
                    System.out.print("I can suggest books based on the subject u r interested in.; ");
                } else if (command.equalsIgnoreCase("how do I get started with [project]") || command.equalsIgnoreCase("start [project]")) {
                    System.out.print("Break it down into smaller tasks and set clear goals.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 improve productivity") || command.equalsIgnoreCase("improve productivity")) {
                    System.out.print("Set specific goals, prioritize tasks, and use productivity tools.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn about [topic]") || command.equalsIgnoreCase("learn about [topic]")) {
                    System.out.print("Read books, take online courses, and join discussion forums about the topic.; ");
                } else if (command.equalsIgnoreCase("how do I improve my public speaking") || command.equalsIgnoreCase("public speaking tips")) {
                    System.out.print("Practice regularly, get feedback, and focus on clear communication.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 start a new hobby") || command.equalsIgnoreCase("start a new hobby")) {
                    System.out.print("Explore your interests, find local groups, and start with beginner resources.; ");
                } else if (command.equalsIgnoreCase("how can I get better at [sport]") || command.equalsIgnoreCase("get better at [sport]")) {
                    System.out.print("Practice regularly, work on technique, and seek feedback from coaches.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn cooking") || command.equalsIgnoreCase("learn cooking")) {
                    System.out.print("Start with simple recipes, watch cooking videos, and practice regularly.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn [skill]") || command.equalsIgnoreCase("learn [skill]")) {
                    System.out.print("Use online courses, practice regularly, and seek advice from experts.; ");
                } else if (command.equalsIgnoreCase("how can I improve my memory") || command.equalsIgnoreCase("improve memory")) {
                    System.out.print("Practice memory exercises, stay organized, and get plenty of sleep.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn new things") || command.equalsIgnoreCase("learn new things")) {
                    System.out.print("Stay curious, read widely, and engage in continuous learning.; ");
                } else if (command.equalsIgnoreCase("how do I get better at [hobby]") || command.equalsIgnoreCase("get better at [hobby]")) {
                    System.out.print("Practice regularly, join clubs, and learn from others.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 develop a skill") || command.equalsIgnoreCase("develop a skill")) {
                    System.out.print("Set clear goals, practice consistently, and seek feedback.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn a new skill") || command.equalsIgnoreCase("learn new skill")) {
                    System.out.print("Find resources online, practice regularly, and get feedback on your progress.; ");
                } else if (command.equalsIgnoreCase("how can I get better at [task]") || command.equalsIgnoreCase("get better at [task]")) {
                    System.out.print("Practice regularly, seek feedback, and make adjustments as needed.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 stay organized") || command.equalsIgnoreCase("stay organized")) {
                    System.out.print("Use tools like calendars, to-do lists, and keep a clean workspace.; ");
                } else if (command.equalsIgnoreCase("how do I stay focused") || command.equalsIgnoreCase("stay focused")) {
                    System.out.print("Set clear goals, eliminate distractions, and take regular breaks.; ");
                }else if (command.contains("file") || command.contains("File ")){
                    System.out.println("Sewer Sir! Here is the Dialog Dabba");
                    JFrame file_frame = new JFrame("Select and Open File");
                    file_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    file_frame.setSize(300, 200);

                    file_frame.setVisible(true);

                    // Call static method from FileChooserHelper
                    FileChooserHelper.openFileChooser(file_frame);
                } else if (command.equalsIgnoreCase("what’s a good way 2 stay motivated") || command.equalsIgnoreCase("stay motivated")) {
                    System.out.print("Set achievable goals, track progress, and reward yourself.; ");
                } else if (command.equalsIgnoreCase("how do I learn more about [topic]") || command.equalsIgnoreCase("learn about [topic]")) {
                    System.out.print("Research online, read books, and engage with experts.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 relax after work") || command.equalsIgnoreCase("relax after work")) {
                    System.out.print("Try taking a walk, reading a book, or practicing relaxation techniques.; ");
                } else if (command.equalsIgnoreCase("how do I start a new project") || command.equalsIgnoreCase("start new project")) {
                    System.out.print("Define your goals, create a plan, and start with small tasks.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 improve my [skill]") || command.equalsIgnoreCase("improve [skill]")) {
                    System.out.print("Practice regularly, seek feedback, and set specific goals.; ");
                } else if (command.equalsIgnoreCase("how can I better manage my time") || command.equalsIgnoreCase("manage time")) {
                    System.out.print("Use time management tools, prioritize tasks, and avoid procrastination.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn new technology") || command.equalsIgnoreCase("learn new technology")) {
                    System.out.print("Use online tutorials, take courses, and stay updated with tech news.; ");
                } else if (command.equalsIgnoreCase("how do I improve my [skill]") || command.equalsIgnoreCase("improve my [skill]")) {
                    System.out.print("Practice regularly and seek constructive feedback.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 improve my health") || command.equalsIgnoreCase("improve health")) {
                    System.out.print("Eat a balanced diet, exercise regularly, and get enough rest.; ");
                } else if (command.equalsIgnoreCase("how do I get better at [skill]") || command.equalsIgnoreCase("get better at [skill]")) {
                    System.out.print("Set clear goals, practice consistently, and seek feedback.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 start a new hobby") || command.equalsIgnoreCase("start new hobby")) {
                    System.out.print("Explore your interests, find beginner resources, and practice regularly.; ");
                } else if (command.equalsIgnoreCase("how do I make the most of my time") || command.equalsIgnoreCase("make most of time")) {
                    System.out.print("Prioritize tasks, set clear goals, and use time management techniques.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 learn new skills") || command.equalsIgnoreCase("learn new skills")) {
                    System.out.print("Practice regularly, use online resources, and seek feedback from experts.; ");
                } else if (command.equalsIgnoreCase("how do I stay productive") || command.equalsIgnoreCase("stay productive")) {
                    System.out.print("Set clear goals, use productivity tools, and manage your time effectively.; ");
                } else if (command.equalsIgnoreCase("what’s a good way 2 start a new hobby") || command.equalsIgnoreCase("start new hobby")) {
                    System.out.print("Identify your interests, find beginner resources, and practice regularly.; ");
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
                    while (true) {
                        System.out.println();
                        System.out.println("1 for Enter Custom URL");
                        System.out.println("2 for exit Custom URL mode");
                        System.out.println();
                        System.out.print("Me: ");
                        int option = in.nextInt();
                        in.nextLine();

                        if (option == 1) {
                            System.out.println("1 for WWW protocol");
                            System.out.println("2 for HTTPS protocol");
                            System.out.println("Select the protocol");
                            int select_protocol = in.nextInt();
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
                    // No break here, this continues to the next command checks
                    
                } else if (command.equalsIgnoreCase("exit") ||
                        command.equalsIgnoreCase("bye") ||
                        command.equalsIgnoreCase("cya")) {
                    System.out.println("Goodbye, Have a nice day");
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