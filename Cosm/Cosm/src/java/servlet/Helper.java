package servlet;

import commands.*;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

public class Helper {

    private static Helper instance = null;
    public static final String login = "login";
    public static final String reg = "reg";
    public static final String basket = "basket";
    public static final String menu = "menu";
    public static final String inbasket = "inbasket";
    public static final String delete = "delete";
    public static final String order = "order";
    public static final String sort = "sort";
    public static final String sort2 = "sort2";
    public static final String comm = "savecomm";
    public static final String showcomm = "showcomm";
    public static final String printkredit = "printkredit";
    public static final String menuAdmin = "menuAdmin";
    public static final String showcommAdmin = "showcommAdmin";
    public static final String deletecomm = "deletecomm";
    public static final String deletefood = "deletefood";
    public static final String editfood = "editfood";

    public static final String editadmin = "editadmin";
    public static final String searchadmin = "searchadmin";
    public static final String searchuser = "searchuser";
    public static final String addadmin = "addadmin";
    public static final String grafic = "grafic";

    HashMap<String, Command> commands = new HashMap<String, Command>();

    private Helper() {
        commands.put(login, new EnterCommand());
        commands.put(reg, new RegistrationCommand());
        commands.put(menu, new MenuCommand());
        commands.put(inbasket, new InBasketCommand());
        commands.put(basket, new ShowBasketCommand());
        commands.put(delete, new DeleteCommand());
        commands.put(order, new OrderCommand());
        commands.put(sort, new SortCommand());
        commands.put(sort2, new SortCommand2());
        commands.put(showcomm, new Comm());
        commands.put(comm, new Savecomm());
        commands.put(printkredit, new PrintCredit());
        commands.put(menuAdmin, new MenuAdmin());
        commands.put(showcommAdmin, new ShowcommAdmin());
        commands.put(deletecomm, new DeleteComm());
        commands.put(deletefood, new DeleteFood());
        commands.put(editadmin, new EditAdmin());
        commands.put(searchadmin, new SearchAdmin());
        commands.put(searchuser, new SearchUser());
        commands.put(addadmin, new AddAdmin());
        commands.put(grafic, new GraficCommand());
        commands.put(editfood, new EditFood());

    }

    public Command getCommand(HttpServletRequest request) {
        String action = request.getParameter("command");
        Command command = commands.get(action);
        if (command == null) {
            command = new NoCommand();
        }
        return command;
    }

    public static Helper getInstance() {
        if (instance == null) {
            instance = new Helper();
        }
        return instance;
    }
}
