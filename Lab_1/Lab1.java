public class Lab1{
  public static void main(String args[]){
      int n=17, m=14;
      short[] g = new short[18];
      int count = 0;
      for (short i=2;i<=18;i++){
          g[count] = i;
          count++;
      }
        double first, second;
      float[] x = new float[14];
      float min = -13.0f, max = 10.0f;
      for (int i=0;i<m;i++){
          x[i] = (float)(min + Math.random() * (max - min + 1));
          if(x[i] > max){
            x[i]-=1;
          }
      }
      double [][] s = new double[n][m];
      for (int i = 0; i<n;i++){
        if (g[i] == 11){
          for(int j = 0; j<m; j++){
            s[i][j] = Math.sin(Math.pow(Math.cos((double)x[j]),(Math.exp(Math.abs(x[j])))/(Math.asin((x[j] - 1.5)/23) - 1)));
          }
        }else if((g[i] == 2) || (g[i] == 7) || (g[i] == 9) || (g[i] == 10) || (g[i] == 13) || (g[i] == 15) || (g[i] == 16) || (g[i] == 17)){
          for(int j = 0; j<m; j++){
            first = (3./4) / Math.pow(0.25 * Math.sin(x[j]), 3);
            second = Math.pow((Math.tan(x[j]) / 2.0), 2);
            s[i][j] = Math.pow(first, second);
          }
        }else{
          for(int j = 0; j<m; j++){
            s[i][j] = Math.pow(((1./2)/(Math.pow(Math.E, (Math.sin(Math.tan((double)x[j])))))), 2);
          }
        }
      }
      for (int i = 0; i<n;i++){
        for (int j = 0; j<m;j++){
          System.out.printf("%9.2f", s[i][j] % 10);
          System.out.print(" ");
        }
        System.out.println(" ");
      }
  }
}