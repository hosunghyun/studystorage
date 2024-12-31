import logo from './logo.svg';
import './App.css';
import {use, useState} from 'react';

function Header(props) {
  return <header>
      <h1><a href="/" onClick={(event)=>{
        event.preventDefault();
        props.onChangeMode();
      }}>{props.title}</a></h1>
    </header>
}
function Nav(props) {
  const lis = []
  for(let i = 0; i < props.lis.length; i++) {
    let t = props.lis[i];
    lis.push(<li key={t.id}><a id={t.id} href={'/react/' + t.id} onClick={(event)=>{
      event.preventDefault();
      props.onChangeMode(Number(event.target.id));
    }}>{t.title}</a></li>)
  }
  return <nav>
    <ol>
      {lis}
    </ol>
  </nav>
}
function Article(props) {
  return <article>
    <h2>{props.title}</h2>
    {props.body}
  </article>
}
function Create(props) {
  return <article>
    <h2>Create</h2>
    <form onSubmit={event=>{
      event.preventDefault();
      const title = event.target.title.value;
      const body = event.target.body.value;
      props.onCreate(title, body);
    }}> 
      <p><input type="text" name="title" placeholder="title" /></p>
      <p><textarea name="body" placeholder="body"></textarea></p>
      <p><input type="submit" value="Create"/></p>
    </form>
  </article>
}
function Update(props) {
  const [title, setTitle] = useState(props.title);
  const [body, setBody] = useState(props.body);
  return <article>
    <h2>Update</h2>
    <form onSubmit={event=>{
      event.preventDefault();
      const title = event.target.title.value;
      const body = event.target.body.value;
      props.onUpdate(title, body);
    }}> 
      <p><input type="text" name="title" placeholder="title" value={title} onChange={(event)=>{
        setTitle(event.target.value);
      }}/></p>
      <p><textarea name="body" placeholder="body" value={body} onChange={(event)=>{
        setBody(event.target.value);
      }}></textarea></p>
      <p><input type="submit" value="Update"/></p>
    </form>
  </article>
}

function App() {
  const [mode, setMode] = useState('WELCOME');
  const [id, setId] = useState(null);
  const [nextId, setNextId] = useState(4);
  const [lis, setLis] = useState([
    {id : 1, title : "html", body : "html is"},
    {id : 2, title : "css", body : "css is"},
    {id : 3, title : "javascript", body : "javascript is"}
  ]);
  let content = null;
  let conetextControl = null;
  if(mode === 'WELCOME') {
    content = <Article title="Welcome" body="Hello, WEB"></Article>
  }
  else if (mode === 'READ') {
    let title, body = null;
    for(let i = 0; i < lis.length; i++) {
      if(lis[i].id === id) {
        title = lis[i].title;
        body = lis[i].body;
      }
    }
    content = <Article title={title} body={body}></Article>
      conetextControl = <><li><a href={'/update' + id} onClick={(event)=>{
        event.preventDefault();
        setMode('UPDATE');
      }}>Update</a></li>
      <li><input type="button" value="delete" onClick={()=>{
        const newLis = []
        for(let i = 0; i < lis.length; i++) {
          if(lis[i].id !== id) {
            newLis.push(lis[i]);
          }
        }
        setLis(newLis);
      }}/></li>
    </>
  }
  else if (mode === 'CREATE') {
    content = <Create onCreate={(_title, _body)=>{
      const newLis = {id : nextId, title : _title, body : _body}
      const newLISS = [...lis]
      newLISS.push(newLis);
      setLis(newLISS);
      setMode('READ');
      setId(nextId);
      setNextId(nextId+1);
    }}></Create>
  }
  else if (mode === 'UPDATE') {
    let title, body = null;
    for(let i = 0; i < lis.length; i++) {
      if(lis[i].id === id) {
        title = lis[i].title;
        body = lis[i].body;
      }
    }
    content = <Update title={title} body={body} onUpdate={(title, body)=>{
      const newLis = [...lis]
      const updateLis = {id : id, title : title, body : body}
      for(let i = 0; i < newLis.length; i++) {
        if(newLis[i].id === id) {
          newLis[i] = updateLis;
          break;
        }
      }
      setLis(newLis);
      setMode('READ');
    }}></Update>
  }
  return (
    <div>
      <Header title="React" onChangeMode={()=>{
        setMode('WELCOME');
      }}></Header>
      <Nav lis={lis} onChangeMode={(_id)=>{
        setId(_id);
        setMode('READ');
      }}></Nav>
      {content}
      <ul>
        <li><a href="/create" onClick={(event)=>{
          event.preventDefault();
          setMode('CREATE');
        }}>Create</a></li>
        {conetextControl}
      </ul>
    </div>
  );
}

export default App;
