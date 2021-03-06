package me.apisek12.plugin;

import org.bukkit.ChatColor;

public enum Message {

    PERMISSION_MISSING("You don't have permission to use that command!"),
    COMMAND_ARGUMENT_UNKNOWN("Unknown argument!\\nCommand should look like:\\n &6/drop <info, stack, DROPPABLE_NAME>"),
    GUI_TITLE("Item Drop Chances"),
    GUI_EXIT_BUTTON("Exit"),
    GUI_BACK_BUTTON("Back"),
    INFO_ENABLED("enabled"),
    INFO_DISABLED("disabled"),
    GUI_ITEM_DESCRIPTION_THIS_ITEM_DROP_IS("This item drop is"),
    GUI_ITEM_DESCRIPTION_RIGHT_CLICK_TO_TOGGLE("Right click to toggle."),
    GUI_ITEM_DESCRIPTION_LEFT_CLICK_TO_SEE_DETAILS("Left click to see details."),
    COBBLE_TOGGLE_BUTTON_NAME("Drop of cobble from stone"),
    INFO_FORTUNE_0("No fortune"),
    INFO_FORTUNE_1("Fortune 1"),
    INFO_FORTUNE_2("Fortune 2"),
    INFO_FORTUNE_3("Fortune 3"),
    INFO_DROP_CHANCE("Drop chance"),
    INFO_DROP_AMOUNT("Drop amount"),
    GUI_SECOND_TITLE("Drop information"),
    INFO_DROP_DISABLED("Drop from ores was disabled by server administrator."),
    TREASURE_CHEST_PRIMARY("&6You have found a &2treasure &6chest!"),
    TREASURE_CHEST_SECONDARY("&bI wonder what's inside...");
    


    private String defaultMessage;

    Message(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }



    public void setDefaultMessage(String defaultMessage) {
        String toSet = ChatColor.translateAlternateColorCodes('&', defaultMessage);
        if (toSet == "") return;
        this.defaultMessage = toSet;
    }

    @Override
    public String toString() {
        return this.defaultMessage;
    }
}
