package models.webscope;
import javax.persistence.*;


@Entity
public class Film {

	
	@Id
private Integer id;
public void setId(Integer i) {id = i;}


   @Column
String titre;
  
   
public void setTitre(String t) {titre= t;}
public String getTitre() {return titre;}


    @Column
Integer annee;
    
    
public void setAnnee(Integer a) {annee = a;}
public Integer getAnnee() {return annee;}


    @ManyToOne
    @JoinColumn (name="code_pays")
Pays pays;
public void setPays(Pays p) {pays = p;}
public Pays getPays() {return pays;}
}