package ss0_ObjectDirection.baitap1.controller;

import ss0_ObjectDirection.baitap1.model.Candidates;
import ss0_ObjectDirection.baitap1.service.CandidatesService;
import ss0_ObjectDirection.baitap1.service.CandidatesServiceImp;

import java.util.Scanner;

public class CandidatesController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandidatesService candidatesService = new CandidatesServiceImp();
        Candidates[] candidatesList = null;
        int slectec;
        do {
            System.out.println("1.All contestants");
            System.out.println("2.Add contestants");
            System.out.println("3.Exit");

            slectec = Integer.parseInt(scanner.nextLine());
            candidatesList = candidatesService.fildAll();
            switch (slectec){
                case 1:
                    for (Candidates candidates : candidatesList){
                        if (candidates == null){
                            break;
                        }
                        System.out.println(candidates);
                    }
                    break;
                case 2:
                    System.out.println("Input id :");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name :");
                    String name = scanner.nextLine();
                    System.out.println("Input datebirth :");
                    String datebirth = scanner.nextLine();
                    System.out.println("Input mathscore :");
                    double mathscore = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input literature :");
                    double literature = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input  english :");
                    double  english = Integer.parseInt(scanner.nextLine());
                    Candidates candidatesnew = new Candidates(id,name,datebirth,mathscore,literature,english);
                    candidatesService.add(candidatesnew);
                    break;
                case 3:
                    for (Candidates candidates : candidatesList){
                        if(candidates.getSum() > 15){
                            System.out.println(candidates);
                        }
                    }
                    break;
                default:
                    System.out.println("Error ....");
            }
        } while (slectec != 9);
    }
}
