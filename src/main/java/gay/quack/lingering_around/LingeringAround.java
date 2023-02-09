package gay.quack.lingering_around;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LingeringAround implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("lingering_around");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		BrewingRecipeRegistry.registerItemRecipe(Items.SPLASH_POTION, Items.SLIME_BALL, Items.LINGERING_POTION);
	}
}
