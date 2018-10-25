package variations;

import variations.IPAddressMultiton.AddressType;

public class TestVariations
{
    public static void main(String[] args)
    {
        IPAddressMultiton services = IPAddressMultiton.getInstance(
                AddressType.SERVICE_LAYER);
        IPAddressMultiton isThisDifferent = IPAddressMultiton.getInstance(
                AddressType.SERVICE_LAYER);

        System.out.println(services == isThisDifferent);

        IPAddressMultiton localhost = IPAddressMultiton.getInstance(AddressType.LOCALHOST);
    }
}
