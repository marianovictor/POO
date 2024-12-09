package parametros;
import java.util.Scanner;//importando o bliblioterca que aceita inputs do teclado


public class GradeBookTest {
    public static void main( String[] args){
        Scanner input = new Scanner( System.in ); //criacando um scanner para obter a entrada 

        GradeBook myGrade = new GradeBook();// criando um objeto 'GradeBook' e o atribui a 'myGade'

        System.out.println("Plase enter the course name: "); 
        String nameOfCourse = input.nextLine(); //pega a entrada do teclado e salva em 'nameOfCourse'

        myGrade.displayMessage(nameOfCourse);//chama o metodo 'displayMessage' de 'myGrade' e passa 'nameOfCourse' como parametro
    }
}
