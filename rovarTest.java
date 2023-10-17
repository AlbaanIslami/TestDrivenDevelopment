/**
 * Alban Islami
 */

import static org.junit.jupiter.api.Assertions.*;

class rovarTest {

    @org.junit.jupiter.api.Test
    void enrov()
    {
        assertEquals("hohejoj popa dodigog", rovar.enrov("hej pa dig"));

    }

    @org.junit.jupiter.api.Test
    void enrov1()
    {
        assertEquals("HOHEJOJ POPA DODIGOG", rovar.enrov("HEJ PA DIG"));
    }

    @org.junit.jupiter.api.Test
    void enrov2()
    {
        assertEquals("yxoxmomörordodarorenon jojulolia boblolomomqoqvovisostot popå fofäkoktotnoninongog i soscochohwoweizoz", rovar.enrov("yxmördaren julia blomqvist på fäktning i schweiz"));
    }

    @org.junit.jupiter.api.Test
    void enrov3()
    {
        assertEquals("YXOXMOMÖRORDODARORENON JOJULOLIA BOBLOLOMOMQOQVOVISOSTOT POPÅ FOFÄKOKTOTNONINONGOG I SOSCOCHOHWOWEIZOZ", rovar.enrov("YXMÖRDAREN JULIA BLOMQVIST PÅ FÄKTNING I SCHWEIZ"));
    }
    @org.junit.jupiter.api.Test
    void enrov4()
    {
        assertEquals("", rovar.enrov(""));
    }
    @org.junit.jupiter.api.Test
    void enrov5()
    {
        assertEquals(null, rovar.enrov(null));
    }
    @org.junit.jupiter.api.Test
    void enrov6()
    {
        assertNotEquals("", rovar.enrov("1234567890"));
    }
    @org.junit.jupiter.api.Test
    void enrov7() {
        assertEquals("yxoxmomörordodarorenon jojulolia boblolomomqoqvovisostot popå fofäkoktotnoninongog i soscochohwoweizoz! & hohonon soskokrorivoveror #yxoxmomörordodarore popå inonsostotroragogroramom/fofacocebobookok", rovar.enrov("yxmördaren julia blomqvist på fäktning i schweiz! & hon skriver #yxmördare på instragram/facebook"));
    }
    @org.junit.jupiter.api.Test
    void enrov8()
    {
        assertNotEquals("", rovar.enrov("!@#€%&/()"));
    }
    @org.junit.jupiter.api.Test
    void derov()
    {
        assertEquals("hej pa dig", rovar.derov("hohejoj popa dodigog"));
    }

    @org.junit.jupiter.api.Test
    void derov1()
    {
        assertEquals("HEJ PA DIG", rovar.derov("HOHEJOJ POPA DODIGOG"));
    }

    @org.junit.jupiter.api.Test
    void derov2()
    {
        assertEquals("yxmördaren julia blomqvist på fäktning i schweiz", rovar.derov("yxoxmomörordodarorenon jojulolia boblolomomqoqvovisostot popå fofäkoktotnoninongog i soscochohwoweizoz"));
    }

    @org.junit.jupiter.api.Test
    void derov3()
    {
        assertEquals("YXMÖRDAREN JULIA BLOMQVIST PÅ FÄKTNING I SCHWEIZ", rovar.derov("YXOXMOMÖRORDODARORENON JOJULOLIA BOBLOLOMOMQOQVOVISOSTOT POPÅ FOFÄKOKTOTNONINONGOG I SOSCOCHOHWOWEIZOZ"));

    }

    @org.junit.jupiter.api.Test
    void derov4()
    {
        assertEquals("", rovar.derov(""));
    }

    @org.junit.jupiter.api.Test
    void derov5()
    {
        assertEquals(null, rovar.derov(null));
    }

    @org.junit.jupiter.api.Test
    void derov6()
    {
        assertNotEquals("1234567890", rovar.derov(""));
    }
    @org.junit.jupiter.api.Test
    void derov7()
    {
        assertEquals("yxmördaren julia blomqvist på fäktning i schweiz! & hon skriver #yxmördare på instragram/facebook", rovar.derov("yxoxmomörordodarorenon jojulolia boblolomomqoqvovisostot popå fofäkoktotnoninongog i soscochohwoweizoz! & hohonon soskokrorivoveror #yxoxmomörordodarore popå inonsostotroragogroramom/fofacocebobookok"));
    }
    @org.junit.jupiter.api.Test
    void derov8()
    {
        assertNotEquals("!@#€%&/()", rovar.enrov(""));
    }
}