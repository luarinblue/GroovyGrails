package projecttracker

class ListProjectsController {

    def index = { 
		redirect (action: current)
	}
	
	def current = {
		render "<h1>Project Tracker Video Tutorials</h1>"
	}
	
	def overdue = {
		render "Order Valentines Day Package"
	}
}
