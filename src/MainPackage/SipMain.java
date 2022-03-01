package MainPackage;

import org.mjsip.sip.provider.SipProvider;
import org.mjsip.server.ServerProfile;
import org.mjsip.server.StatefulProxy;
import org.zoolu.util.Flags;


public class SipMain {

    public static void main(String [] args) {
        SipProvider sipProvider = new SipProvider("192.168.100.18", 5060);
        ServerProfile serverProfile = new ServerProfile(null);
        StatefulProxy stateFullProxy = new StatefulProxy(sipProvider, serverProfile);
    }
}

