#!/usr/bin/ruby
require 'mathn'
if File.exists?('hugenumbers.clj')
	File.delete('hugenumbers.clj')
end
File.open('hugenumbers.clj', 'w') {|f| 
	f.write("(ns resume-timeline.test.hugenumbers)")
	f.write("(def huge-number [")
	count = 1000000
	step = count/100
	count.times.map{ |x|
		f.write(rand(10000).to_s + " ")
		if x % step == 0
			puts ((x/count)*100).to_i
		end
	} 
	f.write("])")
}
