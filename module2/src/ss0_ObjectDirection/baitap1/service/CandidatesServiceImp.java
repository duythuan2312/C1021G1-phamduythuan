package ss0_ObjectDirection.baitap1.service;

import ss0_ObjectDirection.baitap1.model.Candidates;

public class CandidatesServiceImp implements CandidatesService{
    private static Candidates[] candidatesList = new Candidates[1];
    static {
        candidatesList[0] = new Candidates(1,"Thuan","23/12/2003,",10,10,10);
    }


    @Override
    public void add(Candidates candidates) {
        Candidates[] newcandidatesList = new Candidates[candidatesList.length+1];
        newcandidatesList[newcandidatesList.length -1] = candidates;

        for(int i = 0 ; i <candidatesList.length ; i++){
            newcandidatesList[i] = candidatesList[i];
        }
        candidatesList = newcandidatesList;

    }
    @Override
    public Candidates[] fildAll() {
        return candidatesList ;
    }
}
