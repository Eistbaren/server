package de.reservationbear.eist.db.type

/**
 * Specifies the type of served dishes of a restaurant
 */
enum class RestaurantType {
    ITALIAN,
    FRENCH,
    GREEK,
    GERMAN,
    JAPANESE,
    CHINESE,
    SPANISH,
    BRITISH,
    KOREAN;

    fun getEmojis() : String{
        return when (this) {
            ITALIAN -> "🍕"
            FRENCH -> "🥐"
            GREEK -> "🐟"
            GERMAN -> "🥨"
            JAPANESE -> "🍣"
            CHINESE -> "🍙"
            SPANISH -> "🥘"
            BRITISH -> "🫖"
            KOREAN -> "🍚"
        }
    }
}