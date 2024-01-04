package TP2;

public class Salaire {
    public double TauxHoraire= 9.22;
    public double tauxMajore=11.53;
    public double payer(int heuresTravaille){
        return calculSalaire(heuresTravaille);
    }

    /**
     * Calcule le salaire en fonction des heures travaillès
     * @param heuresTravaille les heures de travail effectué
     * @return le salaire
     */
    private double calculSalaire(int heuresTravaille){
        //si le salarié a fait 151 heures 67 ou moins on multiplie par le taux horaire standard
        if(heuresTravaille<=151.67) {
            return heuresTravaille * this.TauxHoraire;
        }

        /*sinon on calcul les heures supplémentaires et on les multiplie par le taux horaire majoré de 25%
        pour ensuite recalculer le salaire classique plus le salaire majoré grâce aux heures suppléméntaire*/

        else {
            double heuresSup = heuresTravaille - 151.67;
            double salaireHsup = heuresSup * this.tauxMajore;
            return (heuresTravaille*this.TauxHoraire)+salaireHsup;
        }
    }
}
