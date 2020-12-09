package FC;

import java.sql.SQLException;

public class EditController extends Controller{
    Deck editDeck;

    public EditController() throws SQLException {

    }
    /**
     * Creates a new card in the deck
     */
    public void insertCard(String table, String term, String def) throws SQLException {
       super.insertCard(table, term, def);
       editDeck = super.getDeck(table);
    }
    /**
     * Deletes the selected card from the deck
     */
    public void deleteCard(Card card, String deckName) throws SQLException {
        super.deleteCard(card, deckName);
        editDeck.removeCard(card);
    }
}