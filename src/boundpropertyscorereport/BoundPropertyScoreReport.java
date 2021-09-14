/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyscorereport;

import java.util.Scanner;

/**
 *
 * @author poramet
 */
public class BoundPropertyScoreReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 l1 = new Listener1();
        Listener2 l2 = new Listener2();
        mySource.addPropertyChangeListener(l1);
        mySource.addPropertyChangeListener(l2);

        while (true) {
            System.out.print("Enter Score ");
            String inp = sc.nextLine();
            if (inp.equals("")) {
                break;
            } else {
                mySource.setValue(inp);
            }
        }
    }

}
