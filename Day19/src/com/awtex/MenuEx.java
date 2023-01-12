package com.awtex;


import java.awt.*;
public class MenuEx extends Frame{

	private MenuBar mb = new MenuBar();
	
	private Menu file = new Menu("File");
	private Menu edit = new Menu("Toolkit");
	private Menu view = new Menu("view");
	private Menu help = new Menu("Help");
	private Menu ecolor = new Menu("color");
	private Menu esize = new Menu("size");
	
	private MenuItem fnew = new MenuItem("NewFile");
	private MenuItem fopen = new MenuItem("FileOpen");
	private MenuItem fsave = new MenuItem("FileSaveAs");
	private MenuItem fsaveas = new MenuItem("Exit");
	private MenuItem fexit = new MenuItem("Exit");
	
	private CheckboxMenuItem ecred = new CheckboxMenuItem("Red");	
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("Green");	
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("Blue");	
	
	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");
	
	private Button bt1 = new Button("Confrim");
	private Button bt2 = new Button("Cancel");
	
	

	public MenuEx(){
		
		
		super("Menu Test");
		
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		
		ecolor.add(ecred);ecolor.add(ecgreen);ecolor.add(ecblue);
		esize.add(es10);esize.add(es20);esize.add(es30);
		
		edit.add(ecolor);
		edit.addSeparator();
		edit.add(esize);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.addSeparator();
		file.add(fexit);
		
		setLayout(new BorderLayout());
		
		add("North",new Label("Today hard Study ^^", Label.CENTER));
		
		
		
		add("Center", new TextArea());
		Panel p = new Panel(new GridLayout(1,2));
		p.add(bt1);
		p.add(bt2);
		
		add("South",p);
		
		
		
			WinEvent w = new WinEvent();
		
			setSize(300, 200);
										// 최소 크기
			setVisible(true);
			addWindowListener(w);
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
