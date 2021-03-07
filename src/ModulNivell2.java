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
			System.out.println("Introdueix la nota del "+(i+1)+" alumne");
			 notaAlum= nota.nextInt();		 					 					 		
			 	while(notaAlum<0 || notaAlum>10) 
			 	{
				 System.out.println("Introuce un valor entre 0 y 10");
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
						System.out.println("La media del alummno "+(i+1)+" es "+media/3);	
						if (media/3<5)
						{
							System.out.println("El alumno "+(i+1)+" ha SUSPENDIDO");
						}
								else {
									System.out.println("El alumno "+(i+1)+" ha APROBADO");
									 }
						
				}	
		
		
	}
}


