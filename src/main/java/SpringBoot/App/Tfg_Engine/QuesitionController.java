package SpringBoot.App.Tfg_Engine;

public class QuesitionController {
    QestionService service;
    public List<Quesiton> findAllQuestions(Question id){
        return service.findAllQuestions(id);
    }
}
