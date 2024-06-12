class Subject{
  private String ID;
  private String name;
  private int maxMarks;
  private int marksObtain;

  public Subject(String ID,String name,int maxMarks,int marksObtain){
    this.ID=ID;
    this.name=name;
    this.maxMarks=maxMarks;
    this.marksObtain=marksObtain;
  }

  public String getId(){return ID;}
  public String getName(){return name;}
  public int getmaxMarks(){return maxMarks;}
  public int marksObtain(){return marksObtain;}

}
public class array_loop {
  Subject subs[]=new Subject[3];
  subs[0]=new Subject("s101","data_structure",100);
  subs[1]=new Subject("s102","algorithms",100);
}
