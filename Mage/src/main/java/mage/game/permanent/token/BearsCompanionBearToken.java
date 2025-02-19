

package mage.game.permanent.token;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;

/**
 *
 * @author spjspj
 */
public final class BearsCompanionBearToken extends TokenImpl {

    public BearsCompanionBearToken() {
        super("Bear Token", "4/4 green Bear creature token");
        setOriginalExpansionSetCode("KTK");
        cardType.add(CardType.CREATURE);
        color.setGreen(true);
        subtype.add(SubType.BEAR);
        power = new MageInt(4);
        toughness = new MageInt(4);
    }
    public BearsCompanionBearToken(final BearsCompanionBearToken token) {
        super(token);
    }

    public BearsCompanionBearToken copy() {
        return new BearsCompanionBearToken(this);
    }
}
