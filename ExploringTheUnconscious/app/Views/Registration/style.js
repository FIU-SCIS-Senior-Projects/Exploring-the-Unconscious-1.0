import {StyleSheet} from 'react-native';

const styles = StyleSheet.create ({
	container: {
		flex: 1,
		backgroundColor: 'rgba(0,0,0,0)',
	},
        firstTextContainer: {
		top: 40,
		height: 40,
	        marginBottom: 40,
		borderWidth: 1,
	        borderRadius: 4,
		alignItems: 'center',
		justifyContent: 'center',
		marginLeft: 60,
		width: 250,
	},

        textContainer: {
		height: 40,
	        marginTop: 20,
		borderWidth: 1,
	        borderRadius: 4,
		alignItems: 'center',
		justifyContent: 'center',
		marginLeft: 60,
		width: 250,
	},
	button: {
		top: 40,
		borderWidth: 1,
		borderRadius: 3,
		height: 30,
		width: 150,
		marginLeft: 115,
	},
	buttonText: {
	     fontSize: 20,
	     textAlign: 'center',
	     fontFamily: 'Futura-Medium',
	},

});
export default styles;
