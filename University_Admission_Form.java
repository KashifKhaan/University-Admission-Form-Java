import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class University_Admission_Form {
    private static JLabel name;
    private static JLabel father_Name;
    private static JLabel d_O_B;
    private static JLabel religion;
    private static JLabel domicile;
    private static JLabel present_Address;
    private static JLabel permanent_Address;
    private static JLabel email;
    private static JLabel phone;
    private static JLabel qualification;
    private static JLabel fsc_Marks;
    private static JLabel college;
    private static JLabel obtained_Marks;
    private static JLabel total_Marks;
    private static JLabel percentage;

    static JTextField name_Input;
    static JTextField father_Name_Input;
    static JTextField d_O_B_Input;
    static JTextField religion_Input;
    static JTextField domicile_Input;
    static JTextField present_Address_Input;
    static JTextField permanent_Address_Input;
    static JTextField email_Input;
    static JTextField phone_Input;
    static JTextField qualification_Input;
    static JTextField fsc_Marks_Input;
    static JTextField college_Input;
    static JTextField obtained_Marks_Input;
    static JTextField total_Marks_Input;
    static JTextField percentage_Input;
    private static JButton print, clear;
    static String a,b,c,d,f,g,h,i,j,k,l,m,n,o,p;


    private static String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private static String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private static String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022",
            "2023", "2024", "2025", "2026"};


    static Font myFont = new Font("Bahnschrift",Font.BOLD,20);
    static Border border = BorderFactory.createDashedBorder(Color.BLUE, 5,3l);

    // Constructor
    public University_Admission_Form(){
        try {
            File file = new File("Students Records.txt");
            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
                System.out.println("File Name: " + file.getName());
            } else {
                System.out.println("File Already Exist");
            }
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    public static void writing(){
        try {
            FileWriter write = new FileWriter("Students Records.txt");
            write.write("Name:                     |           "+a+"\n");
            write.write("Father Name:              |           "+b+"\n");
            write.write("Date Of Birth:            |           "+c+"\n");
            write.write("Domicile:                 |           "+d+"\n");
            write.write("Religion:                 |           "+f+"\n");
            write.write("Present Address:          |           "+g+"\n");
            write.write("Permanent Address:        |           "+h+"\n");
            write.write("Email:                    |           "+i+"\n");
            write.write("Phone:                    |           "+j+"\n");
            write.write("Qualification:            |           "+k+"\n");
            write.write("FSC Marks:                |           "+l+"\n");
            write.write("College:                  |           "+m+"\n");
            write.write("Obtained Marks:           |           "+n+"\n");
            write.write("Total Marks:              |           "+o+"\n");
            write.write("Percentage:               |           "+p+"\n");
            write.close();
            System.out.println("Record Wrote Successfully");
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }




    public static void main(String[] arg0){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(900,720);
        frame.setTitle("University Of Swabi Admission Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300,20);


        frame.add(panel);
        frame.setResizable(false);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setSize(400,400);


        panel.setLayout(null);

        // Title
        JLabel title = new JLabel("{-----University Of Swabi Admission Form-----}");
        title.setBounds(260,20,500,20);
        title.setForeground(Color.BLUE);
        title.setFont(myFont);
        panel.add(title);

        LocalDate date = LocalDate.now();

        JLabel now = new JLabel("Date:  "+date);
        now.setBounds(15,15,100,15);
        panel.add(now);

        // Name
        name = new JLabel("Name:");
        name.setBounds(150,60,400,50);
        name.setForeground(Color.BLUE);
        panel.add(name);
        name_Input = new JTextField("Enter Your Name");
        name_Input.setBounds(250,69,220,30);
        name_Input.setForeground(Color.BLUE);
        name_Input.setBackground(Color.LIGHT_GRAY);
        name_Input.setBorder(border);



        name_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (name_Input.getText().equals("Enter Your Name")){
                    name_Input.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (name_Input.getText().isEmpty()){
                    name_Input.setText("Enter Your Name");
                }
            }
        });
        panel.add(name_Input);

        // Father Name
        father_Name = new JLabel("Father Name:");
        father_Name.setBounds(150,110,400,50);
        panel.add(father_Name);
        father_Name_Input = new JTextField("Enter Your Father Name");
        father_Name_Input.setBounds(250,120,220,30);
        father_Name_Input.setBorder(border);
        father_Name_Input.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                if (father_Name_Input.getText().equals("Enter Your Father Name"));
                father_Name_Input.setText("");
            }
            @Override
            public void focusLost(FocusEvent e){
                if (father_Name_Input.getText().isEmpty()){
                    father_Name_Input.setText("Enter Your Father Name");
                }
            }
        });
        panel.add(father_Name_Input);

        // Date Of Birth
        d_O_B = new JLabel("Date Of Birth:");
        d_O_B.setBounds(150,160,400,50);
        panel.add(d_O_B);
        d_O_B_Input = new JTextField("Enter Your Date Of Birth");
        d_O_B_Input.setBounds(250,170,220,30);

        JComboBox date1 = new JComboBox(dates);
        date1.setFont(new Font("Arial", Font.PLAIN, 15));
        date1.setSize(62, 20);
        date1.setLocation(250, 174);
        panel.add(date1);

        JComboBox month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(72, 20);
        month.setLocation(318, 174);
        panel.add(month);

        JComboBox year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(72, 20);
        year.setLocation(396, 174);
        panel.add(year);

        // Domicile
        domicile = new JLabel("Domicile:");
        domicile.setBounds(150,210,400,50);
        panel.add(domicile);
        domicile_Input = new JTextField("Enter Your Domicile");
        domicile_Input.setBounds(250,220,220,30);
        domicile_Input.addFocusListener(new FocusAdapter() {
           @Override
           public void focusGained(FocusEvent e){
               if (domicile_Input.getText().equals("Enter Your Domicile")){
                   domicile_Input.setText("");
               }
           }
           @Override
            public void focusLost(FocusEvent e){
               if (domicile_Input.getText().isEmpty()){
                   domicile_Input.setText("Enter Your Domicile");
               }
           }
        });
        panel.add(domicile_Input);

        // Religion
        religion = new JLabel("Religion:");
        religion.setBounds(150,260,400,50);
        panel.add(religion);

        JRadioButton muslim = new JRadioButton("Muslim");
        muslim.setFont(new Font("Arial", Font.PLAIN, 15));
        muslim.setSelected(true);
        muslim.setSize(75, 20);
        muslim.setLocation(250, 275);
        panel.add(muslim);

        JRadioButton non_Muslim = new JRadioButton("Non-Muslim");
        non_Muslim.setFont(new Font("Arial", Font.PLAIN, 15));
        non_Muslim.setSelected(false);
        non_Muslim.setSize(120, 20);
        non_Muslim.setLocation(340, 275);
        panel.add(non_Muslim);

        ButtonGroup gengp = new ButtonGroup();
        gengp.add(muslim);
        gengp.add(non_Muslim);

        // Present Address
        present_Address = new JLabel("Present Address:");
        present_Address.setBounds(150,310,400,50);
        panel.add(present_Address);
        present_Address_Input = new JTextField("Enter Your Present Address");
        present_Address_Input.setBounds(250,320,220,30);
        present_Address_Input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e){
                if (present_Address_Input.getText().equals("Enter Your Present Address")){
                    present_Address_Input.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e){
                if (present_Address_Input.getText().isEmpty()){
                    present_Address_Input.setText("Enter Your Present Address");
                }
            }
        });
        panel.add(present_Address_Input);

        // Permanent Address
        permanent_Address = new JLabel("P/Address:");
        permanent_Address.setBounds(150,360,400,50);
        panel.add(permanent_Address);
        permanent_Address_Input = new JTextField("Enter Permanent Address");
        permanent_Address_Input.setBounds(250,370,220,30);
        permanent_Address_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if (permanent_Address_Input.getText().equals("Enter Permanent Address")){
                    permanent_Address_Input.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e){
                if (permanent_Address_Input.getText().isEmpty()){
                    permanent_Address_Input.setText("Enter Permanent Address");
                }
            }
        });
        panel.add(permanent_Address_Input);

        // Email
        email = new JLabel("Email:");
        email.setBounds(150,410,400,50);
        panel.add(email);
        email_Input = new JTextField("Enter Your Email");
        email_Input.setBounds(250,420,220,30);
        email_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if (email_Input.getText().equals("Enter Your Email")){
                    email_Input.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e){
                if (email_Input.getText().isEmpty()){
                    email_Input.setText("Enter Your Email");
                }
            }
        });
        panel.add(email_Input);

        // Phone
        phone = new JLabel("Phone:");
        phone.setBounds(150,460,400,50);
        panel.add(phone);
        phone_Input = new JTextField("Enter Your Phone");
        phone_Input.setBounds(250,470,220,30);
        phone_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e){
                if (phone_Input.getText().equals("Enter Your Phone")){
                    phone_Input.setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e){
                if (phone_Input.getText().isEmpty()){
                    phone_Input.setText("Enter Your Phone");
                }
            }
        });
        panel.add(phone_Input);

        // Qualification
        qualification = new JLabel("Qualification:");
        qualification.setBounds(150,510,400,50);
        panel.add(qualification);
        qualification_Input = new JTextField("Enter Your Qualification");
        qualification_Input.setBounds(250,520,220,30);
        qualification_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (qualification_Input.getText().equals("Enter Your Qualification")){
                    qualification_Input.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (qualification_Input.getText().isEmpty()){
                    qualification_Input.setText("Enter Your Qualification");
                }
            }
        });
        panel.add(qualification_Input);

        // FS.c Marks
        fsc_Marks = new JLabel("Fsc_Marks:");
        fsc_Marks.setBounds(150,560,400,50);
        panel.add(fsc_Marks);
        fsc_Marks_Input = new JTextField("Enter Fsc Marks");
        fsc_Marks_Input.setBounds(250,570,220,30);
        fsc_Marks_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (fsc_Marks_Input.getText().equals("Enter Fsc Marks")){
                    fsc_Marks_Input.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (fsc_Marks_Input.getText().isEmpty()){
                    fsc_Marks_Input.setText("Enter Fsc Marks");
                }
            }
        });
        panel.add(fsc_Marks_Input);

        // College
        college = new JLabel("College:");
        college.setBounds(520,60,400,50);
        panel.add(college);
        college_Input = new JTextField("Enter Your College");
        college_Input.setBounds(620,69,220,30);
        college_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (college_Input.getText().equals("Enter Your College")){
                    college_Input.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (college_Input.getText().isEmpty()){
                    college_Input.setText("Enter Your College");
                }
            }
        });
        panel.add(college_Input);

        // Obtained Marks
        obtained_Marks = new JLabel("Obtained Marks:");
        obtained_Marks.setBounds(520,110,400,50);
        panel.add(obtained_Marks);
        obtained_Marks_Input = new JTextField("Enter Your Obtained Marks");
        obtained_Marks_Input.setBounds(620,120,220,30);
        obtained_Marks_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(obtained_Marks_Input.getText().equals("Enter Your Obtained Marks")){
                    obtained_Marks_Input.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (obtained_Marks_Input.getText().isEmpty()){
                    obtained_Marks_Input.setText("Enter Your Obtained Marks");
                }
            }
        });
        panel.add(obtained_Marks_Input);

        // Total Marks
        total_Marks = new JLabel("Total Marks:");
        total_Marks.setBounds(520,160,400,50);
        panel.add(total_Marks);
        total_Marks_Input = new JTextField("Enter Your Total Marks");
        total_Marks_Input.setMaximumSize(new Dimension(5,3));
        total_Marks_Input.setBounds(620,170,220,30);
        total_Marks_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(total_Marks_Input.getText().equals("Enter Your Total Marks")){
                    total_Marks_Input.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (total_Marks_Input.getText().isEmpty()){
                    total_Marks_Input.setText("Enter Your Total Marks");
                }
            }
        });
        panel.add(total_Marks_Input);

        // Percentage
        percentage = new JLabel("Percentage:");
        percentage.setBounds(520,210,400,50);
        panel.add(percentage);
        percentage_Input = new JTextField("Enter Your Percentage");
        percentage_Input.setBounds(620,220,220,30);
        percentage_Input.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (percentage_Input.getText().equals("Enter Your Percentage")){
                    percentage_Input.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (percentage_Input.getText().isEmpty()){
                    percentage_Input.setText("Enter Your Percentage");
                }
            }
        });
        panel.add(percentage_Input);


        // Print Button
        print = new JButton("Print Record");
        print.setBackground(Color.PINK);
        print.setBounds(250,620,150,40);
        print.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                a = name_Input.getText();
                b = father_Name_Input.getText();
                d = domicile_Input.getText();
                g = present_Address_Input.getText();
                h = permanent_Address_Input.getText();
                i = email_Input.getText();
                j = phone_Input.getText();
                k = qualification_Input.getText();
                l = fsc_Marks_Input.getText();
                m = college_Input.getText();
                n = obtained_Marks_Input.getText();
                o = total_Marks_Input.getText();
                p = percentage_Input.getText();

                new Design().setVisible(true);

                System.out.println("Name:                     |           "+a);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Father Name:              |           "+b);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Date Of Birth:            |           "+c);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Domicile:                 |           "+d);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Religion:                 |           "+f);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Present Address:          |           "+g);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Permanent Address:        |           "+h);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Email:                    |           "+i);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Phone:                    |           "+j);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Qualification:            |           "+k);
                System.out.println("-----------------------------------------------------------");
                System.out.println("FSC Marks:                |           "+l);
                System.out.println("-----------------------------------------------------------");
                System.out.println("College:                  |           "+m);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Obtained Marks:           |           "+n);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Total Marks:              |           "+o);
                System.out.println("-----------------------------------------------------------");
                System.out.println("Percentage:               |           "+p);
                System.out.println("-----------------------------------------------------------");
                /// calling the writing method
                writing();
            }
        });
        panel.add(print);

        clear = new JButton("Clear Record");
        clear.setBackground(Color.PINK);
        clear.setBounds(400,620,150,40);
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent z){
                name_Input.setText(null);
                father_Name_Input.setText(null);
                domicile_Input.setText(null);
                present_Address_Input.setText(null);
                permanent_Address_Input.setText(null);
                email_Input.setText(null);
                phone_Input.setText(null);
                qualification_Input.setText(null);
                fsc_Marks_Input.setText(null);
                college_Input.setText(null);
                obtained_Marks_Input.setText(null);
                total_Marks_Input.setText(null);
                percentage_Input.setText(null);
            }
        });
        panel.add(clear);
        frame.setVisible(true);
    }
}


class Design extends JFrame{
    static Font myFont = new Font("Ink Free",Font.BOLD,20);
    Design() {
        University_Admission_Form uaf = new University_Admission_Form();
        JPanel panel_Main = new JPanel();
        JPanel panel_Top = new JPanel();
        this.add(panel_Top);
        this.add(panel_Main);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(530,750);
        this.setTitle("Printed Record");
        this.setResizable(false);
        this.setLocation(400,10);
        panel_Main.setLayout(null);
        panel_Main.setBackground(Color.PINK);
        panel_Top.setLayout(null);
        panel_Top.setBackground(Color.YELLOW);
//        panel_Main.setBounds(0,0,680,50);
        panel_Top.setBounds(0,0,680,60);
        JLabel title = new JLabel("Student Record Is Given Below");
        title.setBounds(100,25,600,15);
        title.setFont(myFont);
        panel_Top.add(title);

        LocalDate date = LocalDate.now();

        JLabel now = new JLabel("Date:  "+date);
        now.setBounds(410,65,100,15);
        panel_Main.add(now);


        JLabel name = new JLabel("Name: ");
        name.setBounds(75,100,100,15);
        panel_Main.add(name);
        JLabel name_Input = new JLabel();
        name_Input.setBounds(275,100,300,15);
        name_Input.setText(uaf.a);
        panel_Main.add(name_Input);

        JLabel father_Name = new JLabel("Father Name: ");
        father_Name.setBounds(75,140,100,15);
        panel_Main.add(father_Name);
        JLabel father_Name_Input = new JLabel();
        father_Name_Input.setBounds(275,140,300,15);
        father_Name_Input.setText(uaf.b);
        panel_Main.add(father_Name_Input);

        JLabel d_O_B = new JLabel("Date Of Birth: ");
        d_O_B.setBounds(75,180,100,15);
        panel_Main.add(d_O_B);
        JLabel d_O_B_Input = new JLabel();
        d_O_B_Input.setBounds(275,180,300,15);
        d_O_B_Input.setText(uaf.c);
        panel_Main.add(d_O_B_Input);

        JLabel domicile = new JLabel("Domicile: ");
        domicile.setBounds(75,220,100,15);
        panel_Main.add(domicile);
        JLabel domicile_Input = new JLabel();
        domicile_Input.setBounds(275,220,300,15);
        domicile_Input.setText(uaf.d);
        panel_Main.add(domicile_Input);

        JLabel religion = new JLabel("Religion: ");
        religion.setBounds(75,260,100,15);
        panel_Main.add(religion);
        JLabel religion_Input = new JLabel();
        religion_Input.setBounds(275,260,300,15);
        religion_Input.setText(uaf.f);
        panel_Main.add(religion_Input);

        JLabel present_Address = new JLabel("Present Address: ");
        present_Address.setBounds(75,300,150,15);
        panel_Main.add(present_Address);
        JLabel present_Address_Input = new JLabel();
        present_Address_Input.setBounds(275,300,300,15);
        present_Address_Input.setText(uaf.g);
        panel_Main.add(present_Address_Input);

        JLabel permanent_Address = new JLabel("Permanent Address: ");
        permanent_Address.setBounds(75,340,150,15);
        panel_Main.add(permanent_Address);
        JLabel permanent_Address_Input = new JLabel();
        permanent_Address_Input.setBounds(275,340,300,15);
        permanent_Address_Input.setText(uaf.h);
        panel_Main.add(permanent_Address_Input);

        JLabel email = new JLabel("Email: ");
        email.setBounds(75,380,100,15);
        panel_Main.add(email);
        JLabel email_Input = new JLabel();
        email_Input.setBounds(275,380,300,15);
        email_Input.setText(uaf.i);
        panel_Main.add(email_Input);

        JLabel phone = new JLabel("Phone: ");
        phone.setBounds(75,420,100,15);
        panel_Main.add(phone);
        JLabel phone_Input = new JLabel();
        phone_Input.setBounds(275,420,300,15);
        phone_Input.setText(uaf.j);
        panel_Main.add(phone_Input);

        JLabel qualification = new JLabel("Qualification: ");
        qualification.setBounds(75,460,100,15);
        panel_Main.add(qualification);
        JLabel qualification_Input = new JLabel();
        qualification_Input.setBounds(275,460,300,15);
        qualification_Input.setText(uaf.k);
        panel_Main.add(qualification_Input);

        JLabel fsc_Marks = new JLabel("Fsc Marks: ");
        fsc_Marks.setBounds(75,500,100,15);
        panel_Main.add(fsc_Marks);
        JLabel fsc_Marks_Input = new JLabel();
        fsc_Marks_Input.setBounds(275,500,300,15);
        fsc_Marks_Input.setText(uaf.l);
        panel_Main.add(fsc_Marks_Input);

        JLabel college = new JLabel("College: ");
        college.setBounds(75,540,100,15);
        panel_Main.add(college);
        JLabel college_Input = new JLabel();
        college_Input.setBounds(275,540,300,15);
        college_Input.setText(uaf.m);
        panel_Main.add(college_Input);

        JLabel obtained_Marks = new JLabel("Obtained Marks: ");
        obtained_Marks.setBounds(75,580,100,15);
        panel_Main.add(obtained_Marks);
        JLabel obtained_Marks_Input = new JLabel();
        obtained_Marks_Input.setBounds(275,580,300,15);
        obtained_Marks_Input.setText(uaf.n);
        panel_Main.add(obtained_Marks_Input);

        JLabel total_Marks = new JLabel("Total Marks ");
        total_Marks.setBounds(75,620,100,15);
        panel_Main.add(total_Marks);
        JLabel total_Marks_Input = new JLabel();
        total_Marks_Input.setBounds(275,620,300,15);
        total_Marks_Input.setText(uaf.o);
        panel_Main.add(total_Marks_Input);

        JLabel percentage = new JLabel("Percentage: ");
        percentage.setBounds(75,660,100,15);
        panel_Main.add(percentage);
        JLabel percentage_Input = new JLabel();
        percentage_Input.setBounds(275,660,300,15);
        percentage_Input.setText(uaf.p);
        panel_Main.add(percentage_Input);


        JButton back = new JButton("Close");
        back.setBounds(75,685,150,30);
        back.setBackground(Color.GREEN);
        back.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               System.exit(0);
           }
        });
        panel_Main.add(back);

    }
}
