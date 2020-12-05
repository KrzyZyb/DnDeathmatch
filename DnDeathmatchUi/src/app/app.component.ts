import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { SocketClientService } from './core/socket.client.service';
import { PostInput } from './core/post.input';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  online: number = 0;
  constructor(private client: SocketClientService){}
  ngOnInit(){
    this.onPost().subscribe(data => console.log("Data recieved on AppComponent onPost subscription: "+data))
  }

  pingBackend(){
    console.log('Im trying to ping backend from AppComponent pingBackend()');
    this.client.send('/topic/posts/create', {authorId:"Pinger", content: "Content",title:"Title"});
  }

  onPost(): Observable<PostInput> {
    console.log('In On Post in Post Service');
    return this.client.onMessage('/topic/posts/created');
  }

  pingGreeting(){
    console.log('Im trying to ping greeting backend from AppComponent pingGreeting()');
    this.client.send('/chat', {authorId:"Pinger", content: "Content",title:"Title"});
  }

  

}
