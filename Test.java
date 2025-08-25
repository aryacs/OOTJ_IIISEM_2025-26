//command line argument
class Test{

public static void main(String args[]){
if(args.length == 0){
System.out.println("No command line argument is provided");
} else {
System.out.println("Command Line Arguments are: ");
for(int i = 0; i < args.length; i++){
//int num = Integer.parseInt(str);
System.out.println("Argument" + (i + 1) + ": " + args[i]);
}
}
}
}