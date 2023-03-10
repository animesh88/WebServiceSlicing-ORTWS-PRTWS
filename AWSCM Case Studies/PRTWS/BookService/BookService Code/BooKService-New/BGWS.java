/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BooKService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ani
 */
@WebService()
public class BGWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BGWS")
    public String bgWS(@WebParam(name = "chapterNumber") int chapterNumber, @WebParam(name = "verseNumber") int verseNumber) {
        String verse = "";
        BGVerse obj = new BGVerse();
        switch (chapterNumber) {
            case 1:
                verse = obj.bgChapter1(verseNumber);
                break;
            case 2:
                verse = obj.bgChapter2(verseNumber);
                break;
            case 3:
                verse = obj.bgChapter3(verseNumber);
                break;
            case 4:
                verse = obj.bgChapter4(verseNumber);
                break;
            case 5:
                verse = obj.bgChapter5(verseNumber);
                break;
            case 6:
                verse = obj.bgChapter6(verseNumber);
                break;
            case 7:
                verse = obj.bgChapter7(verseNumber);
                break;
            case 8:
                verse = obj.bgChapter8(verseNumber);
                break;
            case 9:
                verse = obj.bgChapter9(verseNumber);
                break;
            case 10:
                verse = obj.bgChapter10(verseNumber);
                break;
            case 11:
                verse = obj.bgChapter11(verseNumber);
                break;
            case 12:
                verse = obj.bgChapter12(verseNumber);
                break;
            case 13:
                verse = obj.bgChapter13(verseNumber);
                break;
            case 14:
                verse = obj.bgChapter14(verseNumber);
                break;
            case 15:
                verse = obj.bgChapter15(verseNumber);
                break;
            case 16:
                verse = obj.bgChapter16(verseNumber);
                break;
            case 17:
                verse = obj.bgChapter17(verseNumber);
                break;
            case 18:
                verse = obj.bgChapter18(verseNumber);
                break;

            default:
                verse = "Invalid chapter number";
                break;
        }
        //System.out.println(verse);

        return verse;
    }

    @WebMethod(operationName = "bgWSAbst")
    public String bgWSAbst(@WebParam(name = "chapterNumber") int chapterNumber) {
        String verse = "";
        switch (chapterNumber) {
            case 1:
                verse = "As the opposing armies stand poised for battle, Arjuna, the mighty warrior, sees his intimate relatives, teachers and friends in both armies ready to fight and sacrifice their lives. Overcome by grief and pity, Arjuna fails in strength, his mind becomes bewildered, and he gives up his determination to fight.";
                break;
            case 2:
                verse = "Arjuna submits to Lord Krishna as His disciple, and Krishna begins His teachings to Arjuna by explaining the fundamental distinction between the temporary material body and the eternal spiritual soul. The Lord explains the process of transmigration, the nature of selfless service to the Supreme and the characteristics of a self-realized person.";
                break;
            case 3:
                verse = "Everyone must engage in some sort of activity in this material world. But actions can either bind one to this world or liberate one from it. By acting for the pleasure of the Supreme, without selfish motives, one can be liberated from the law of karma (action and reaction) and attain transcendental knowledge of the self and the Supreme.";
                break;
            case 4:
                verse = "Transcendental knowledge-the spiritual knowledge of the soul, of God, and their relationship-is both purifying and liberating. Such knowledge is the fruit of selfless devotional action (karma-yoga). The Lord explains the remote history of the Gita, the purpose and significance of His periodic descents to the material world, and the necessity of approaching a guru, a realized teacher.";
                break;
            case 5:
                verse = "Outwardly performing all actions but inwardly renouncing their fruits, the wise man, purified by the fire of transcendental knowledge, attains peace, detachment, forbearance, spiritual vision and bliss.";
                break;
            case 6:
                verse = "Astanga-yoga, a mechanical meditative practice, controls the mind and the senses and focuses concentration on Paramatma (the Supersoul, the form of the Lord situated in the heart). This practice culminates in samadhi, full consciousness of the Supreme.";
                break;
            case 7:
                verse = "Lord Krishna is the Supreme Truth, the supreme cause and sustaining force of everything, both material and spiritual. Advanced souls surrender unto Him in devotion, whereas impious souls divert their minds to other objects of worship.";
                break;
            case 8:
                verse = "By remembering Lord Krishna in devotion throughout one's life, and especially at the time of death, one can attain to His supreme abode, beyond the material world.";
                break;
            case 9:
                verse = "Lord Krishna is the Supreme Godhead and the supreme object of worship. The soul is eternally related to Him through transcendental devotional service (bhakti). By reviving one's pure devotion one returns to Krishna in the spiritual realm.";
                break;
            case 10:
                verse = "All wondrous phenomena showing power, beauty, grandeur or sublimity, either in the material world or in the spiritual, are but partial manifestations of Krishna's divine energies and opulence. As the supreme cause of all causes and the support and essence of everything, Krishna is the supreme object of worship for all beings.";
                break;
            case 11:
                verse = "Lord Krishna grants Arjuna divine vision and reveals His spectacular unlimited form as the cosmic universe. Thus He conclusively establishes His divinity. Krishna explains that His own all-beautiful humanlike form is the original form of Godhead. One can perceive this form only by pure devotional service.";
                break;
            case 12:
                verse = "Bhakti-yoga, pure devotional service to Lord Krishna, is the highest and most expedient means for attaining pure love for Krishna, which is the highest end of spiritual existence. Those who follow this supreme path develop divine qualities.";
                break;
            case 13:
                verse = "One who understands the difference between the body, the soul and the Supersoul beyond them both attains liberation from this material world.";
                break;
            case 14:
                verse = "All embodied souls are under the control of the three modes, or qualities, of material nature: goodness, passion, and ignorance. Lord Krishna explains what these modes are, how they act upon us, how one transcends them, and the symptoms of one who has attained the transcendental state.";
                break;
            case 15:
                verse = "The ultimate purpose of Vedic knowledge is to detach one self from the entanglement of the material world and to understand Lord Krishna as the Supreme Personality of Godhead. One who understands Krishna 's supreme identity surrenders unto Him and engages in His devotional service.";
                break;
            case 16:
                verse = "Those who possess demoniac qualities and who live whimsically, without following the regulations of scripture, attain lower births and further material bondage. But those who possess divine qualities and regulated lives, abiding by scriptural authority, gradually attain spiritual perfection.";
                break;
            case 17:
                verse = "There are three types of faith, corresponding to and evolving from the three modes of material nature. Acts performed by those whose faith is in passion and ignorance yield only impermanent, material results, whereas acts performed in goodness, in accord with scriptural injunctions, purify the heart and lead to pure faith in Lord Krishna and devotion to Him.";
                break;
            case 18:
                verse = "Krishna explains the meaning of renunciation and the effects of the modes of nature on human consciousness and activity. He explains Brahman realization, the glories of the Bhagavad-gita, and the ultimate conclusion of the Gita: the highest path of religion is absolute, unconditional loving surrender unto Lord Krishna, which frees one from all sins, brings one to complete enlightenment, and enables one to return to Krishna's eternal spiritual abode.";
                break;

            default:
                verse = "Invalid chapter number";
                break;
        }
        return verse;
    }

    @WebMethod(operationName = "bgAllVerse")
    public String bgAllVerse(@WebParam(name = "chapterNumber") int chapterNumber) {
        String verse = "";
        BGVerse obj = new BGVerse();
        switch (chapterNumber) {
            case 1:
                for (int verseNumber = 1; obj.bgChapter1(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter1(verseNumber));
                }
                break;
            case 2:
                for (int verseNumber = 1; obj.bgChapter2(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter2(verseNumber));
                }
                break;
            case 3:
                for (int verseNumber = 1; obj.bgChapter3(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter3(verseNumber));
                }
                break;
            case 4:
                for (int verseNumber = 1; obj.bgChapter4(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter4(verseNumber));
                }
                break;
            case 5:
                for (int verseNumber = 1; obj.bgChapter5(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter5(verseNumber));
                }
                break;
            case 6:
                for (int verseNumber = 1; obj.bgChapter6(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter6(verseNumber));
                }
                break;
            case 7:
                for (int verseNumber = 1; obj.bgChapter7(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter7(verseNumber));
                }
                break;
            case 8:
                for (int verseNumber = 1; obj.bgChapter8(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter8(verseNumber));
                }
                break;
            case 9:
                for (int verseNumber = 1; obj.bgChapter9(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter9(verseNumber));
                }
                break;
            case 10:
                for (int verseNumber = 1; obj.bgChapter10(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter10(verseNumber));
                }
                break;
            case 11:
                for (int verseNumber = 1; obj.bgChapter11(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter11(verseNumber));
                }
                break;
            case 12:
                for (int verseNumber = 1; obj.bgChapter12(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter12(verseNumber));
                }
                break;
            case 13:
                for (int verseNumber = 1; obj.bgChapter13(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter13(verseNumber));
                }
                break;
            case 14:
                for (int verseNumber = 1; obj.bgChapter14(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter14(verseNumber));
                }
                break;
            case 15:
                for (int verseNumber = 1; obj.bgChapter15(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter15(verseNumber));
                }
                break;
            case 16:
                for (int verseNumber = 1; obj.bgChapter16(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter16(verseNumber));
                }
                break;
            case 17:
                for (int verseNumber = 1; obj.bgChapter17(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter17(verseNumber));
                }
                break;
            case 18:
                for (int verseNumber = 1; obj.bgChapter18(verseNumber) != "Invalid verseNumber"; verseNumber++) {
                    verse = verse.concat(obj.bgChapter18(verseNumber));
                }
                break;

            default:
                verse = "Invalid chapter number";
                break;
        }
        return verse;
    }    
}