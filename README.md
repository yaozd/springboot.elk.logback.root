# springboot.elk.logback.root
SpringBoot应用之ELK-Logback-logstash-logback-encoder-example

```logback
----------------------------------
input {
	tcp {
        port => 4560
        codec => json_lines
    }
}
filter {
    
}
output {
    if "springboot_elk_logback_web" in [tags] {
        elasticsearch {
		hosts => ["127.0.0.1:9200"] 
        index => "elk_logback_web-%{+YYYY.MM.dd}"
		}
    } else if "springboot_tags_name" in [tags] {
		elasticsearch {
		hosts => ["127.0.0.1:9200"] 
        index => "tags_name-%{+YYYY.MM.dd}"
		}
	}else {
        elasticsearch { hosts => ["127.0.0.1:9200"] }
    }
}
---------------------------------
input {
	tcp {
        port => 4560
        codec => json_lines
    }
}
filter {
    
}
output {
   elasticsearch { hosts => ["127.0.0.1:9200"] }
}
----------------------------------
input {
	tcp {
        port => 4560
        codec => json_lines
    }
}
filter {
    
}
output {
    stdout {}
}
----------------------------------
```
