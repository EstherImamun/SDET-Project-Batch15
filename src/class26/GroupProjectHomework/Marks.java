package class26.GroupProjectHomework;

public abstract class Marks {
    double[] scores;
    Marks(double[]scores){
        this.scores=scores;
    }

    abstract double getPercentage();
}
class A extends Marks{

     A(double[]scores){
        super(scores);
    }
    @Override
    double getPercentage(){
         double sum=0;
         for(double score:scores){
             sum=sum+score;
         }
         return sum/3.0;
    }
}
class B extends Marks{

    B(double[]scores){
        super(scores);
    }

    @Override
    double getPercentage() {
        double sum=0;
        for(double score1:scores){
            sum=sum+score1;
        }
        return sum/4.0;
    }

    public static void main(String[] args) {
        double[] scoresA={85.0,90.5,99.3};
        A a=new A(scoresA);
        System.out.println(a.getPercentage());

        double[] scoresB={100.4,76.2,82.5,50.5};
        B b=new B(scoresB);
        System.out.println(b.getPercentage());
    }
}