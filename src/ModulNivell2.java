import java.util.Scanner;
public class ModulNivell2 {

	public static void main(String[] args) {
		double media=0;
		int notaAlum=0;
		int[][] notesAlum =new int[5][3];
		Scanner nota = new Scanner(System.in);	
		for(int i=0;i<5;i++) 
		{			
			//media=0;
			for(int j=0;j<3;j++) 
			{
			System.out.println("Introdueix la nota de "+(i+1)+" l'alumne");
			 notaAlum= nota.nextInt();		 					 					 		
			 	while(notaAlum<0 || notaAlum>10) 
			 	{
				 System.out.println("Introdueix un valor entre 0 i 10");
				 notaAlum= nota.nextInt();
			 	}		 
			 	
				 notesAlum [i][j]= notaAlum;
			 	
			}		
		}	 			
		nota.close();
		System.out.println();
				for(int i=0;i<5;i++) 
				{			
					media=0;
					for(int j=0;j<3;j++) 
					{ 
						media+=notesAlum[i][j];
					}	
						System.out.println("La mitjana de l'alumne "+(i+1)+" és "+media/3);	
						if (media/3<5)
						{
							System.out.println("L'alumne "+(i+1)+" ha SUSPÈS");
						}
								else {
									System.out.println("L'alumne "+(i+1)+" ha APROVAT");
									 }
						
				}	
		
		
	}
}


