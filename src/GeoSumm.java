import java.util.Scanner;

/**
 * Created by ��������� on 28.11.2015.
 */
public class GeoSumm {

    public static double getGeoSumm(final double numA){
        final double firstposNum = 1, denominator = 0.5;
        //������ ����� � ���� �������������� ����������, ��������� ���������� �� �������;
        double posCounter = 0;
        //���������� ����� ����� � �������������� ����������;
        double geoSumm;
        //����� ��������� ����;

        do{
            posCounter++;
            geoSumm = (firstposNum *(1 - Math.pow(denominator, posCounter)))/(1 - denominator);
            //������� ��� ���������� ��������� ���������� �� �������� � ������ ��������,�.�. ��� ����� ���������� ��������;
        }while(geoSumm < numA);

        return geoSumm;
    }

    public static void main(String args[]) {
        Scanner modifier = new Scanner(System.in);

        System.out.println("Enter the number, please:");
        if (modifier.hasNextDouble()) {
            double numA = modifier.nextDouble();

            if(numA < 0){
                System.out.println("The number you entered is above zero, please, try again");
             }else if(numA == 0){
                System.out.println("The number you entered - 0, current summ of the elements is zero");
             }else if(numA > 2.0){
                System.out.println("This number is unavailable for this geometric progression with the current conditions, please, try the number above 2,0");
            }else{
            System.out.println("The number you entered: " + numA + ";" + '\n' + "The summ of the numbers from the line: " + getGeoSumm(numA));
            }

        }else{
            System.out.println("Wrong value of the entered number");
        }
        //� ���� �������� ������������ ���������� ��������� �������������� ����������, ����� ��������� ������� ��������� � ����� 2(�� ������� �������);
        //������� �������� ����� ���������� ������������,����� ������� ��������� ����� ��������� ������� �� �������;
        //����,�������,�������� ����������,���� � ��� ������ ������� �� ������������ ���� �� ���������� - ��� ������� :( ;
    }
}
