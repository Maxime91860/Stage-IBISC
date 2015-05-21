/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

import java.util.ArrayList;

public class Test {

    public static void main(String[] arg) {
        Automate M = new Automate();
        Etat q0 = new Etat("q0");
        Etat q1 = new Etat("q1");
        Etat q2 = new Etat("q2", true);
        M.ajouteEtat(q0);
        M.ajouteEtat(q1);
        M.ajouteEtat(q2);
        M.ajouteTransition(new Transition(q0, "a", q1));
        M.ajouteTransition(new Transition(q0, "b", q0));
        M.ajouteTransition(new Transition(q1, "a", q2));
        M.ajouteTransition(new Transition(q1, "b", q2));

        
        System.out.println(M);
        System.out.println("M.estDeterministe() = " + M.estDeterministe() + "\n");


        System.out.println("M.estComplet() = " + M.estComplet() + "\n");
        M.completer();
        System.out.println(M);
        System.out.println("M.estComplet() = " + M.estComplet() + "\n");

        
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> tmp = new ArrayList<>();
        test.add("a");
        test.add("b");
        //test.add("c");
        test.add("#");

        tmp.addAll(test);

        for (int i = 0; i < 3; i++) {
            ArrayList<String> tmp2 = new ArrayList<>();
            for (int j = 0; j < tmp.size(); j++) {
                tmp2.add(tmp.get(j) + 'a');
                tmp2.add(tmp.get(j) + 'b');
                //tmp2.add(tmp.get(j) + 'c');
                tmp2.add(tmp.get(j) + '#');
            }
            tmp = tmp2;
            test.addAll(tmp);
        }

        System.out.println(afficheL(test));

        for (int j = 0; j < test.size(); j++) {
            System.out.println("M.accepte(\"" + test.get(j) + "\") = " + M.accepte(test.get(j)));
        }


        
                
    }

    public static String afficheL(ArrayList<String> list) {
        String s2 = "{";
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                s2 += list.get(i) + ",";
            } else {
                s2 += list.get(i) + "}";
            }
        }
        return s2;
    }
}
