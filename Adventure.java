// this import is what allows to ask for user input and we import from the huge Java library. You can type out the statement as shown or Eclipse will ask you to import the statement when you call the method.
import java.util.Scanner;
public class Adventure {
public static void main(String[] args) {
Scanner user_input = new Scanner(System.in);
//The computer will first ask what they like more.
System.out.println("Dogs or Cats?");
String input = user_input.nextLine();
input = input.toLowerCase();
if (input.equals("dogs")) {
System.out.println("You chose Dogs.");
//Here we tell the story. I am not very good at stories.
System.out.println("You're walking in the city, and you come across a little dog in an alley way. He seems to be sick, and he does not have a collar.");
System.out.println("He seems to be lost and alone.");
System.out.println("What do you do?");
System.out.println("Run away thinking he has rabies, or pick the dog up and put up Found Dog posters");
String dogs = user_input.nextLine();
dogs = dogs.toLowerCase();
if (dogs.equals("run away")) {
System.out.println("You chose to run away.");
String time;
System.out.print("...(time)");
time = user_input.nextLine();
System.out.println(""+ time +" later, you come back to that alley where the dog was.");
System.out.println("You see the dog laying on the ground.");
System.out.println("The dog isn't moving.");
System.out.println("You check for a pulse.");
System.out.println("There isn't one.");
System.out.println("The dog has passed.");
String dead;
System.out.print("You are...");
dead = user_input.nextLine();
System.out.println("You are "+ dead +".");
System.out.println("\"Well done. Here are the test results: You are a horrible person. I'm serious, that's what it says: \"A horrible person.\" We weren't even testing for that. Don't let that horrible-person thing discourage you. It's just a data point.\" -GLaDOS 2011");
System.out.println("Game over.");
System.exit(0);
}
else if (dogs.equals("pick the dog up")) {
System.out.println("You chose to help the dog.");
System.out.println("You pick up the dog, and he is tolerating it.");
System.out.println("You walk home and take a picture of the dog.");
String food;
System.out.print("You feed the dog with...");
food = user_input.nextLine();
System.out.println("You feed the dog with "+ food +".");
System.out.println("You make some Found Dog posters and describe the dog in full detail.");
String breed;
System.out.print("You decide that the dog is a(n)...");
breed = user_input.nextLine();
System.out.println("You decide that the dog is a(n) "+ breed +", based on the markings and size of the dog.");
System.out.println("It's 11:43pm. You decide it's time to go to bed, and pull some blankets up into a little oval shape and use it as a makeshift dog bed.");
System.out.println("In the morning, you wake up at 7:00am sharp.");
String first;
System.out.print("The first thing you do is...");
first = user_input.nextLine();
System.out.println("The first thing you do is "+ first +".");
System.out.println("You decide to go to the SmartMart and print 50 copies of the Found Dog poster. At $0.50/paper, it will cost you $25.");
System.out.println("You buy a staple gun and 150 staples. At $0.07/staple and the cost for 1 staple gun is $5, it will cost you $15.");
System.out.println("Break bank account on a lost dog... Check.");
String posters;
System.out.print("You begin to put up your Found Dog posters at...");
posters = user_input.nextLine();
String posters2;
System.out.print("You finish putting your posters up at...");
posters2 = user_input.nextLine();
System.out.println("You begin to put up your Found Dod posters at "+ posters +" and bring the dog with you. You finish putting your posters up at "+ posters2 +".");
System.out.println("You head home and you eat lunch. It is now noon. Still no call.");
System.out.println("You go buy a tennis ball for the dog and he is super excited.");
System.out.println("You play ball for an hour straight, and finally, you head back inside.");
String fourpm;
System.out.print("4pm. Still no call. You start to...");
fourpm = user_input.nextLine();
System.out.println("4pm. Still no call. You start to "+ fourpm +".");
System.out.println("It's 10pm. You head upstairs to go to bed.");
String routine;
System.out.print("You do the nightly routine;...");
routine = user_input.nextLine();
System.out.println("You do the nightly routine; "+ routine +".");
System.out.println("11pm. No call.");
System.out.println("It's time to go to bed.");
String dream;
System.out.print("Overnight, you have a dream about...: ");
dream = user_input.nextLine();
System.out.println("Overnight, you have a dream about "+ dream +".");
System.out.println("Its 3am. 3 hours until dawn.");
System.out.println("You fall back asleep 5 minutes later.");
System.out.println("You wake up to the sound of your phone ringing. A random caller.");
System.out.println("You pick up.");
System.out.println("A man on the other end says \"Hi, I saw your Found Dog flyers and I am the owner of the dog.\"");
System.out.println("You are extremely excited.");
System.out.println("You say \"How do I know your the real owner?\"");
String dogname;
System.out.println("His name is...");
dogname = user_input.nextLine();
System.out.println("\"His name is "+dogname+"\".");
System.out.println("You call his name.");
System.out.println("He perks his head up.");
System.out.println("You decide it's proof enough.");
System.out.println("You ask for his adress and he gives it.");
System.out.println("You drive over there with the dog and the dog jumps out of the car when he sees his owner.");
String end;
System.out.print("You...");
end = user_input.nextLine();
System.out.println("You "+end+".");
System.out.println("You did the right thing.");
System.out.println("You decide to go.");
System.out.println("The owner shakes your hand and says that you're welcome to come over whenever you want.");
System.out.println("You drive away.");
System.out.println("You decide to adopt a dog for yourself and it's free.");
System.out.println("\"Well, you found me. Congratulations. Was it worth it? Because despite your violent behavior, the only thing you have managed to break so far is my heart. Maybe you could settle for that and we’ll call it a day.\" -GLaDOS 2007");
System.out.println("You won! Congratulations.");
System.exit(0);
}
}
//If user chose Kittens
else if (input.equals("cats")) {
System.out.println("You chose Cats.");
//Here we tell the story. I am not very good at stories.
System.out.println("You're walking in the city, and you come across a little cat in an alley way. She seems to be sick, and she does not have a collar.");
System.out.println("She seems to be lost and alone.");
System.out.println("What do you do?");
System.out.println("Run away thinking she has rabies, or pick the cat up and put up Found Cat posters");
String cats = user_input.nextLine();
cats = cats.toLowerCase();
if (cats.equals("run away")) {
System.out.println("You chose to run away.");
String time;
System.out.print("...(time)");
time = user_input.nextLine();
System.out.println("One "+ time +" later, you come back to that alley where the cat was.");
System.out.println("You see the cat laying on the ground.");
System.out.println("The cat isn't moving.");
System.out.println("You check for a pulse.");
System.out.println("There isn't one.");
System.out.println("The cat has passed.");
String dead;
System.out.print("You are...");
dead = user_input.nextLine();
System.out.println("You are "+ dead +".");
System.out.println("“Well done. Here are the test results: You are a horrible person. I'm serious, that's what it says: \"A horrible person.\" We weren't even testing for that. Don't let that horrible-person thing discourage you. It's just a data point.” -GLaDOS 2011");
System.out.println("Game over.");
System.exit(0);
}
else if (cats.equals("pick the cat up")) {
System.out.println("You chose to help the cat.");
System.out.println("You pick up the cat, and he is tolerating it.");
System.out.println("You walk home and take a picture of the cat.");
String food;
System.out.print("You feed the cat with...");
food = user_input.nextLine();
System.out.println("You feed the cat with "+ food +".");
System.out.println("You make some Found Dog posters and describe the dog in full detail.");
String breed;
System.out.print("You decide that the cat is a(n)...");
breed = user_input.nextLine();
System.out.println("You decide that the cat is a(n) "+ breed +", based on the markings and size of the cat.");
System.out.println("It's 11:43pm. You decide it's time to go to bed, and pull some blankets up into a little oval shape and use it as a makeshift cat bed.");
System.out.println("In the morning, you wake up at 7:00am sharp.");
String first;
System.out.print("The first thing you do is...");
first = user_input.nextLine();
System.out.println("The first thing you do is "+ first +".");
System.out.println("You decide to go to the SmartMart and print 50 copies of the Found Cat poster. At $0.50/paper, it will cost you $25.");
System.out.println("You buy a staple gun and 150 staples. At $0.07/staple and the cost for 1 staple gun is $5, it will cost you $15.");
System.out.println("Break bank account on a lost cat... Check.");
String posters;
System.out.print("You begin to put up your Found Cat posters at...");
posters = user_input.nextLine();
String posters2;
System.out.print("You finish putting your posters up at...");
posters2 = user_input.nextLine();
System.out.println("You begin to put up your Found Cat posters at "+ posters +" and bring the cat with you. You finish putting your posters up at "+ posters2 +".");
System.out.println("You head home and you eat lunch. It is now noon. Still no call.");
System.out.println("You go buy a tennis ball for the cat and he is super excited.");
System.out.println("You play ball for an hour straight, and finally, you head back inside.");
String fourpm;
System.out.print("4pm. Still no call. You start to...");
fourpm = user_input.nextLine();
System.out.println("4pm. Still no call. You start to "+ fourpm +".");
System.out.println("It's 10pm. You head upstairs to go to bed.");
String routine;
System.out.print("You do the nightly routine;...");
routine = user_input.nextLine();
System.out.println("You do the nightly routine; "+ routine +".");
System.out.println("11pm. No call.");
System.out.println("It's time to go to bed.");
String dream;
System.out.print("Overnight, you have a dream about...: ");
dream = user_input.nextLine();
System.out.println("Overnight, you have a dream about "+ dream +".");
System.out.println("Its 3am. 3 hours until dawn.");
System.out.println("You fall back asleep 5 minutes later.");
System.out.println("You wake up to the sound of your phone ringing. A random caller.");
System.out.println("You pick up.");
System.out.println("A man on the other end says \"Hi, I saw your Found Dog flyers and I am the owner of the cat.\"");
System.out.println("You are extremely excited.");
System.out.println("You say \"How do I know your the real owner?\"");
String dogname;
System.out.println("His name is...");
dogname = user_input.nextLine();
System.out.println("\"His name is "+dogname+"\".");
System.out.println("You call her name.");
System.out.println("She perks her head up.");
System.out.println("You decide it's proof enough.");
System.out.println("You ask for his adress and he gives it.");
System.out.println("You drive over there with the cat and the dog jumps out of the car when he sees his owner.");
String end;
System.out.print("You...");
end = user_input.nextLine();
System.out.println("You "+end+".");
System.out.println("You did the right thing.");
System.out.println("You decide to go.");
System.out.println("The owner shakes your hand and says that you're welcome to come over whenever you want.");
System.out.println("You drive away.");
System.out.println("You decide to adopt a cat for yourself and it's free.");
System.out.println("\"Well, you found me. Congratulations. Was it worth it? Because despite your violent behavior, the only thing you have managed to break so far is my heart. Maybe you could settle for that and we’ll call it a day.\" -GLaDOS 2007");
System.out.println("You won! Congratulations.");
System.exit(0);
}
user_input.close();
System.exit(0);
}
}
}
// Extra line to make me happy :)
