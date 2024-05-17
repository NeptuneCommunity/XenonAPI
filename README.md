# XenonAPI

Official API of Xenon

## Installing
You can either shade this repository into your plugin, or run it as a plugin by itself.

1. Clone this repository
2. Enter the directory: `cd XenonAPI`
3. Build & install with Maven: `mvn clean install`

OR

You can get Xenon's API from the releases tab, then adding it through a libraries' folder:
```xml
<dependencies>
    <dependency>
        <groupId>org.neptune.xenon</groupId>
        <artifactId>Xenon-API</artifactId>
        <version>1.0</version>
        <scope>system</scope>
        <systemPath>${basedir}/libs/Xenon.jar</systemPath>
    </dependency>
</dependencies>
```

## Usage
There are currently only **4 methods** to use.

Retrieving a player's profile and getting the credits of a player.
```java
    static Profile getKeys(Player player)
    static int getKeys(Player player, String key)
    static Map<Integer, ItemStack> getItemsFromCrate(String crateName)
```
The profile object methods are the following ones:
```java
    static String getName()
    static Document getKeys()
```
### Examples
Example usage of Xenon's API

Getting a player's credits on a listener.

```java
@EventHandler
public void onPlayerChat(final AsyncPlayerChatEvent event) {
    if (event.getMessage() == "silverkeys") {
        event.setCancelled(true);
        int keys = XenonAPI.getCredits(event.getPlayer(), "Silver");
        event.getPlayer().sendMessage(ChatColor.translateAlternateChatColors('&', "&eYou have a total of &3&o" + keys + " &ekeys!"))
    }
}
```