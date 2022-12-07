package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

import me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after.GithubIssue;
import me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("sanghun");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제");

        // 데이터를 주입하는 경우 일반적으로 사용하는 방법
        /*GithubIssueData githubIssueData = new GithubIssueData();
        githubIssueData.setId(githubIssue.getId());
        githubIssueData.setTitle(githubIssue.getTitle());*/

        //ModelMapper 적용 (리플렉션을 사용해서 대상 데이터를 타겟 클래스에 넣어준다)
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData dataModelMapper = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println("dataModelMapper = " + dataModelMapper);
    }
}
