package Class.State;

/**
 *
 * @author jorge
 */
public interface OrderState {

    /**
     *
     * @param status
     * @return
     */
    public String processOrder(String status);

    /**
     *
     * @param status
     * @return
     */
    public String endOrder(String status);
}
