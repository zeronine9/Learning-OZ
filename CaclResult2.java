import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class CaclResult2 {
    public static void main(String[] args) {
        for(;;){
            String choose = JOptionPane.showInputDialog(
                null ,
             "لحساب درجات طالب اضغط الرقم واحد (1) \n للخروج من البرنامج اضغط الرقم اثنين (2)",
             "CalcResult@SUST by zahir",
             JOptionPane.PLAIN_MESSAGE);
            
            switch(choose){
                case "1" : calc();break;
                case "2" : System.exit(0);
            }
        }
    }
    public static void calc(){
        
        // taken object from the decimal Format 
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Warnings variable 
        int warnings = 0;

        //Semester 1

        String[] subjects1 = {"اللغة العربية","اللغة الانجليزية","الثقافة الاسلامية","الرياضيات","الفيزياء","مدخل الحاسوب"};
        int[] degrees1 = new int[6];
        for(int i=0 ; i<6 ; i++){
            degrees1[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects1[i],"Semester 1",JOptionPane.PLAIN_MESSAGE));
            if((degrees1[i]>100)||(degrees1[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
               calc();
            }
            if(degrees1[i]<50){
                degrees1[i] = 0;
            }
        }
        float semester1_grade = (((degrees1[0]/25)*3)+((degrees1[1]/25)*3)+((degrees1[2]/25)*3)+((degrees1[3]/25)*3)+((degrees1[4]/25)*4)+((degrees1[5]/25)*4));
        float grade1 = semester1_grade/20 ;
        JOptionPane.showMessageDialog(null, "المعدل ==> " + grade1 + "\n"+"الحالة ==> "+ status(grade1) +"\n"+"------------------------------------------"+"\n"+rate("اللغة العربية", degrees1[0])+"\n"+rate("اللغة الانجلىزية", degrees1[1])+"\n"+rate("الثقافة الاسلامية", degrees1[2])+"\n"+rate("اساسيات الرياضيات", degrees1[3])+"\n"+rate("الفيزياء", degrees1[4])+"\n"+rate("مدخل الحاسوب", degrees1[5]));
        if (grade1<2.0){
            JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            warnings++ ;
        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects1[i], degrees1[i]);
        }

        //*********************************************************************************************************************************************************
        //Semester 2

        String[] subjects2 = {"اللغة العربية","اللغة الانجليزية","الثقافة الاسلامية","الحسيان","الادارة","التواصل البشري ","اساسيات البرمجة"};
        int[] degrees2 = new int[7];
        for(int i=0 ; i<7 ; i++){
            degrees2[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects2[i],"Semester 2",JOptionPane.PLAIN_MESSAGE));
            if((degrees2[i]>100)||(degrees2[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
               calc();
            }
            if(degrees2[i]<50){
                degrees2[i] = 0;
            }
        }
        float semester2_grade = (((degrees2[0]/25)*3)+((degrees2[1]/25)*3)+((degrees2[2]/25)*3)+((degrees2[3]/25)*3)+((degrees2[4]/25)*2)+((degrees2[5]/25)*2)+((degrees2[6]/25)*4));
        float grade2 = semester2_grade/20 ;
        float grade_12 = (grade1+grade2)/2;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade2+"\n"+"المعدل التراكمي ===>"+ df.format(grade_12)+"\n"+"الحالة ==> "+ status(grade_12) + "\n" +"---------------------------------------" +"\n"+rate("اللغة العربية", degrees2[0])+"\n"+rate("اللغة الانجلىزية", degrees2[1])+"\n"+rate("الثقافة الاسلامية", degrees2[2])+"\n"+rate("الحسبان", degrees2[3])+"\n"+rate("مبادئ الادارة", degrees2[4])+"\n"+rate("التواصل البشري", degrees2[5])+"\n"+rate("اساسيات البرمجة", degrees2[6]));
        if(grade_12<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }else{
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings ++ ;
            }
        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects2[i], degrees2[i]);
        }

        //*********************************************************************************************************************************************************

        //Semester 3

        String[] subjects3 = {"الدراسات السودانية","الجبر الخطي","اساليب البرمجة","الهياكل المتقطعة","المكوتات المادية","المحاسبة"};
        int[] degrees3 = new int[6];
        for(int i=0 ; i<6 ; i++){
            degrees3[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects3[i],"Semester 3",JOptionPane.PLAIN_MESSAGE));
            if((degrees3[i]>100)||(degrees3[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
                calc();
            }
            if(degrees3[i]<50){
                degrees3[i] = 0;
            }
        }
        float semester3_grade = (((degrees3[0]/25)*2)+((degrees3[1]/25)*3)+((degrees3[2]/25)*4)+((degrees3[3]/25)*3)+((degrees3[4]/25)*4)+((degrees3[5]/25)*4));
        float grade3 = semester3_grade/20 ;
        float grade_123 = (grade1+grade2+grade3)/3;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade3+"\n"+"المعدل التراكمي ===>"+ df.format(grade_123)+"\n"+"الحالة ==> "+ status(grade_123) + "\n" +"---------------------------------------" +"\n"+rate(" الدراسات السودانية", degrees3[0])+"\n"+rate("الجبر الخطي", degrees3[1])+"\n"+rate("اساليب البرمجة واحد", degrees3[2])+"\n"+rate("الهياكل المتقطعة", degrees3[3])+"\n"+rate("المكونات المادية", degrees3[4])+"\n"+rate("المحاسبة", degrees3[5]));
        if(grade_123<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }
            else if(warnings == 1){
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings++ ;
            }
            else if(warnings == 2){
                JOptionPane.showMessageDialog(null, "انت مفصول");
                System.exit(0);
            }
        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects3[i], degrees3[i]);
        }

        //*********************************************************************************************************************************************************
        //Semester 4

        String[] subjects4 = {"اساليب اليرمجة اثنين","هياكل البيانات والخوارزميات","الاحصاء والخوارزميات","تفاعل الانسان مع الحاسوب","اساسيات تقانة المعلومات","الاقتصاد"};
        int[] degrees4 = new int[6];
        for(int i=0 ; i<6 ; i++){
            degrees4[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects4[i],"Semester 4",JOptionPane.PLAIN_MESSAGE));
            if((degrees4[i]>100)||(degrees4[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
                calc();
            }
            if(degrees4[i]<50){
                degrees4[i] = 0;
            }
        }
        float semester4_grade = (((degrees4[0]/25)*4)+((degrees4[1]/25)*4)+((degrees4[2]/25)*3)+((degrees4[3]/25)*3)+((degrees4[4]/25)*3)+((degrees4[5]/25)*3));
        float grade4 = semester4_grade/20 ;
        float grade_1234 =  (grade1+grade2+grade3+grade4)/4;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade4+"\n"+"المعدل التراكمي ===>"+ df.format(grade_1234)+"\n"+"الحالة ==> "+ status(grade_1234) + "\n" +"---------------------------------------" +"\n"+rate(" اساليب اليرمجة اثنين", degrees4[0])+"\n"+rate("هياكل البيانات والخوارزميات", degrees4[1])+"\n"+rate("الاحصاء والاحتمالات", degrees4[2])+"\n"+rate("تفاعل الانسان والحاسوب", degrees4[3])+"\n"+rate("اساسيات تقانة المعلومات", degrees4[4])+"\n"+rate("الاقتصاد", degrees4[5]));
        if(grade_1234<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }
            else if(warnings == 1){
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings++ ;
            }
            else if(warnings == 2){
                JOptionPane.showMessageDialog(null, "انت مفصول");
                System.exit(0);
            }
        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects4[i], degrees4[i]);
        }
        //*********************************************************************************************************************************************************
        //Semester 5

        String[] subjects5 = {"معمارية الحاسوب","الذكاء الاصطناعي","نظم التشغيل","قواعد البيانات","هندسة البرمجيات","تفاعل الانسان والحاسوب"};
        int[] degrees5 = new int[6];
        for(int i=0 ; i<6 ; i++){
            degrees5[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects5[i],"Semester 5",JOptionPane.PLAIN_MESSAGE));
            if((degrees5[i]>100)||(degrees5[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
                calc();
            }
            if(degrees5[i]<50){
                degrees5[i] = 0;
            }
        }
        float semester5_grade = (((degrees5[0]/25)*3)+((degrees5[1]/25)*4)+((degrees5[2]/25)*4)+((degrees5[3]/25)*3)+((degrees5[4]/25)*3)+((degrees5[5]/25)*3));
        float grade5 = semester5_grade/20 ;
        float grade_12345 = (grade1+grade2+grade3+grade5)/5;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade5+"\n"+"المعدل التراكمي ===>"+ df.format(grade_12345)+"\n"+"الحالة ==> "+ status(grade_12345) + "\n" +"---------------------------------------" +"\n"+rate(" معمارية الحاسوب  ", degrees5[0])+"\n"+rate("الذكاء الاصطناعي  ", degrees5[1])+"\n"+rate("نظم التشغيل ", degrees5[2])+"\n"+rate("نظم قواعد البيانات  ", degrees5[3])+"\n"+rate("هندسة البرمحيات ", degrees5[4])+"\n"+rate("تفاعل الانسان والحاسوب", degrees5[5]));
        if(grade_12345<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }
            else if(warnings == 1){
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings++ ;
            }
            else if(warnings == 2){
                JOptionPane.showMessageDialog(null, "انت مفصول");
                System.exit(0);
            }

        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects5[i], degrees5[i]);
        }

        //*********************************************************************************************************************************************************    
        //Semester 6

        String[] subjects6 = {"التشفير وامن المعلومات","الشبكات","نظم قواعد البيانات 2","تحليل وتصميم الخوارزميات","هندسة البرمجيات","التدريب العملي"};
        int[] degrees6 = new int[6];
        for(int i=0 ; i<6 ; i++){
            degrees6[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects6[i],"Semester 6",JOptionPane.PLAIN_MESSAGE));
            if((degrees6[i]>100)||(degrees6[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
                calc();
            }
            if(degrees6[i]<50){
                degrees6[i] = 0;
            }
        }
        float semester6_grade = (((degrees6[0]/25)*3)+((degrees6[1]/25)*4)+((degrees6[2]/25)*4)+((degrees6[3]/25)*3)+((degrees6[4]/25)*3)+((degrees6[5]/25)*3));
        float grade6 = semester6_grade/20;
        float grade_123456 = (grade1+grade2+grade3+grade4+grade5+grade6)/6;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade6+"\n"+"المعدل التراكمي ===>"+ df.format(grade_123456)+"\n"+"الحالة ==> "+ status(grade_123456) + "\n" +"---------------------------------------" +"\n"+rate(" التشفير وامن المعلومات   ", degrees6[0])+"\n"+rate("الشبكات والاتصالات   ", degrees6[1])+"\n"+rate("نظم قواعد البيانات اتنين ", degrees6[2])+"\n"+rate("تحليل وتصميم الحوارزميات    ", degrees6[3])+"\n"+rate("هندسة البرمجيات 2", degrees6[4])+"\n"+rate("التدريب العملي", degrees6[5]));
        if(grade_123456<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }
            else if(warnings == 1){
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings++ ;
            }
            else if(warnings == 2){
                JOptionPane.showMessageDialog(null, "انت مفصول");
                System.exit(0);
            }
        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects6[i], degrees6[i]);
        }
        //*********************************************************************************************************************************************************
        //Semester 7

        String[] subjects7 = {"طرق البحث","تطبيقات امن المعلومات","تطوير مواقع الويب","ادارة مشاريع تقانة المعلومات","نظم قواعد البيانات 3","مادة اختيارية ","مشروع التخرج 1"};
        int[] degrees7 = new int[7];
        for(int i=0 ; i<7 ; i++){
            degrees7[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects7[i],"Semester 7",JOptionPane.PLAIN_MESSAGE));
            if((degrees7[i]>100)||(degrees7[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
                calc();
            }
            if(degrees7[i]<50){
                degrees7[i] = 0;
            }
        }

        float semester7_grade = (((degrees7[0]/25)*2)+((degrees7[1]/25)*3)+((degrees7[2]/25)*4)+((degrees7[3]/25)*4)+((degrees7[4]/25)*3)+((degrees7[5]/25)*4));
        float grade7 = semester7_grade/20;
        float grade_1234567 = (grade1+grade2+grade3+grade4+grade5+grade6+grade7)/7;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade7+"\n"+"المعدل التراكمي ===>"+ df.format(grade_1234567)+"\n"+"الحالة ==> "+ status(grade_1234567) + "\n" +"---------------------------------------" +"\n"+rate("طرق البحث", degrees7[0])+"\n"+rate("تطبيقات امن المعلومات", degrees7[1])+"\n"+rate("تطوير تطبيقات الويب", degrees7[2])+"\n"+rate("ادارة مشاريع تقانة المعلومات", degrees7[3])+"\n"+rate("نظم قواعد البيانات", degrees7[4])+"\n"+rate(" مادة اختيارية", degrees7[5]));
        if(grade_1234567<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }
            else if(warnings == 1){
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings++ ;
            }
            else if(warnings == 2){
                JOptionPane.showMessageDialog(null, "انت مفصول");
                System.exit(0);
            }
        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects7[i], degrees7[i]);
        }

        //*********************************************************************************************************************************************************
        //Semester 8

        String[] subjects8 = {"قضايا مهنية واخلاقية","تطوير تطبيقات الوبب 2","الحوسبة النقالة","مادة اختيارية","مشروع التخرج"};
        int[] degrees8 = new int[5];
        for(int i=0 ; i<5 ; i++){
            degrees8[i] = Integer.parseInt(JOptionPane.showInputDialog(null ,"ادخل درجة مادة  "+subjects8[i],"Semester 8",JOptionPane.PLAIN_MESSAGE));
            if((degrees8[i]>100)||(degrees8[i]<0)){
                JOptionPane.showMessageDialog(null, "خطأ , تاكد من ان الدرجة اكبر من صفر واقل من ال100");
                calc();
            }
            if(degrees8[i]<50){
                degrees8[i] = 0;
            }
        }
        int graduation_project = (degrees7[6]+degrees8[1])/2;
        float semester8_grade = (((degrees8[0]/25)*2)+((degrees8[1]/25)*4)+((degrees8[2]/25)*4)+((degrees8[3]/25)*4)+((degrees8[4]/25)*6));
        float grade8 = semester8_grade/20;
        float grade_12345678 = (grade1+grade2+grade3+grade4+grade5+grade6+grade7+grade8)/8;

        JOptionPane.showMessageDialog(null, "المعدل الفصلي ==> " + grade8+"\n"+"المعدل التراكمي ===>"+ df.format(grade_12345678)+"\n"+"الحالة ==> "+ status(grade_12345678) + "\n" +"---------------------------------------" +"\n"+rate("قضايا مهنية واخلاقية", degrees8[0])+"\n"+rate("تطوير تطبيقات الويب", degrees8[1])+"\n"+rate("الحوسبة النقالة", degrees8[2])+"\n"+rate("المادة الاحتيارية الثانية", degrees8[3])+"\n"+rate("مشروع التخرج الكامل", graduation_project));
        if(grade_12345678<2.0){
            if(warnings == 0){
                JOptionPane.showMessageDialog(null, "الانذار الاول , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
                warnings++ ;
            }
            else if(warnings == 1){
            JOptionPane.showMessageDialog(null, "الانذار الثاني , قم بمراجعة وتنظيف موادك واحرص على ان يكون معدلك فوق المتوسط (2.0)");
            JOptionPane.showMessageDialog(null, "هذا اخر انذار , المرة القادمة سيتم فصلك");
            warnings++ ;
            }
            else if(warnings == 2){
                JOptionPane.showMessageDialog(null, "انت مفصول");
                System.exit(0);
            }

        }
        for(int i=0 ; i<6 ; i++){
            molhag(subjects8[i], degrees8[i]);
        }

    }
    public static String rate(String subject,int grade){
        String rate;
        if(grade >= 90){
            rate = "A+";
        }else if((grade >= 80)&&(grade < 90)) {
            rate = "A";
        }else if((grade >= 70)&&(grade < 80)){
            rate = "B+";
        }else if((grade >= 60)&&(grade < 70)){
            rate = "B";
        }else if((grade >= 50)&&(grade < 60)){
            rate = "C";
        }else{
            rate = "ملحق";
        }
        return (subject + " ==> " + rate);
    }
    public static String status(float grade){
        if(grade >= 2.0){
            return "نجاح";
        }else{
            return "رسوب";
        }
    }
    public static void molhag(String subject, int score){
        if (score < 50){
            int degre = Integer.parseInt(JOptionPane.showInputDialog(null ,   " ادخل درجة ملحق مادة "+subject,"الملاحق",JOptionPane.PLAIN_MESSAGE));
            if (degre<50){
                JOptionPane.showMessageDialog(null, "رسبت مجددا فيها , لك الخيار ان تمتحنها مجددا السمستر القادم او تاخذها معك للسمسترات القادمة");
            }
        }
    }
}