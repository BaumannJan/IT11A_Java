package aWorkingprogress;

/*
Einlesen über die Klasse "Eingabe"
Diese Klasse beinhaltet die Methoden:
				  Eingabe.readDouble()
				  Eingabe.readInt()
				  Eingabe.readString()          */
import java.io.*;

public class Eingabe
{
 /* ---------------->  Methode Double einlesen <-------------------------------*/
 	public static double readDouble()
 	{
 	 BufferedReader br;
  	String inputString;
  	double value = 0.0;

  	br = new BufferedReader(new InputStreamReader(System.in));

  	try
  		{
   		inputString = br.readLine();
   		value = Double.parseDouble(inputString);
  		}
  	catch(IOException _uh)
  			{
   			System.out.println("Lesefehler !");
  			}
  	catch(NumberFormatException ex)
  				{
    			System.out.println("Sie haben keinen double-Wert eingegeben !");
  				}
  	return value;
 	}
  /* ----------------> Ende Methode Double einlesen <-------------------------------*/

  /* ----------------> Methode Integer einlesen <-------------------------------*/
 public static int readInt()
 {
  BufferedReader br;
  String inputString;
  int value = 0;

  br = new BufferedReader(new InputStreamReader(System.in));

  	try
  	{
   	inputString = br.readLine();
   	value = Integer.parseInt(inputString);
  	}
  	catch(IOException _uh)
  		{
   		System.out.println("Lesefehler !");
  		}
  	catch(NumberFormatException ex)
  			{
    		System.out.println("Sie haben keinen int-Wert eingegeben !");
  			}
  	return value;
 }
 /* ----------------> Ende Methode Integer einlesen <-------------------------------*/


 /* ----------------> Methode String einlesen <-------------------------------*/

 public static String readString()
 {
  BufferedReader br;
  String inputString = "";

  br = new BufferedReader(new InputStreamReader(System.in));

  try
  		{
   		inputString = br.readLine();
  		}
  catch(IOException _uh)
  			{
   			System.out.println("Lesefehler !");
  			}
  return inputString;
 }
  /* ----------------> Ende Methode String einlesen <-------------------------------*/
} // class

